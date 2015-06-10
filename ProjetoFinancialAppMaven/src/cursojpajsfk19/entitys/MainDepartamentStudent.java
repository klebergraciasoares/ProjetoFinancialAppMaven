package cursojpajsfk19.entitys;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MainDepartamentStudent {
  static EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
  static EntityManager manager = factory.createEntityManager();

  public static void main(String[] a) throws Exception {
    manager.getTransaction().begin();
    
    
    StudentNew student = new StudentNew();
    student.setName("Joe");
    manager.persist(student);
    
    StudentNew student1 = new StudentNew();
    student1.setName("Doe");
    manager.persist(student1);
    
    Department dept = new Department();
    dept.setName("Ciencia Comput");
    student.setDepartment(dept);
    student1.setDepartment(dept);
    
    manager.flush();
    


    
    
    
    Query query = manager.createQuery("SELECT e FROM StudentNew e");
    List<StudentNew> list = (List<StudentNew>) query.getResultList();
    //System.out.println("Estudantes "+list);
    
    for(StudentNew studentList : list){
    	//System.out.println(" | Nome: " +studentList.getName());
    }
    
    query = manager.createQuery("SELECT d FROM Department d");
    List<Department> dList = (List<Department>) query.getResultList();
    //System.out.println(dList);
    
    for(Department departmantList : dList){
    	//System.out.println(" Nome Dept: " +departmantList.getName());
    }
    
    Query queryOneToMany = manager.createQuery("SELECT d, sn FROM Department d join StudentNew sn d.id = sn.department.id");
    List<Department> departmentStudentList = (List<Department>) queryOneToMany.getResultList();
    
    for(Department departMentStudentLis : departmentStudentList){
    	System.out.println("depar " +departMentStudentLis.getName()+ " | Estudantes " +departMentStudentLis.getStudents() );
    }
    
    
    
    manager.getTransaction().commit();
    manager.close();
    factory.close();
    
    HelperDepartamentStudent.checkData();
  }
}