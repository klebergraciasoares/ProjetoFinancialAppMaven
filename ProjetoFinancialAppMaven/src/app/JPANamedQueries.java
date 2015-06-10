package app;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * @author Administrator
 *
 */
public class JPANamedQueries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("jpa");
		EntityManager em=emf.createEntityManager();
		try{
			EntityTransaction entr=em.getTransaction();
			entr.begin();
			//first query
			Query query=em.createNamedQuery("allStudentRecords");
			query.setParameter(1, 100);
			List stList=query.getResultList();
			Iterator stIterator=stList.iterator();
			while(stIterator.hasNext()){
				Student st=(Student)stIterator.next();
				System.out.print("sname:"+st.getSname());
				System.out.print(" sroll:"+st.getSroll());
				System.out.print(" scourse:"+st.getScourse());
				System.out.println();
			}
			//second query 
			Query update_query=em.createNamedQuery("updateStudentRecords");
			update_query.setParameter(1, "Suman Saurabh");
			update_query.setParameter(2, "Suman");
			int updateData=update_query.executeUpdate();
			System.out.println(updateData +" record updated");
			entr.commit();
		}
		finally{
			em.close();
		}

	}

}
