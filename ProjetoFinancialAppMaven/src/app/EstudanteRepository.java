package app;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.EntityManager;

public class EstudanteRepository {

	private EntityManager manager;
	
	public EstudanteRepository(EntityManager manager){  
		this.manager = manager;
	}

	public void adicionar(Student p){
		this.manager.persist(p);
	}
	
	public Student buscar(Long id){
		return this.manager.find(Student.class, id);
	}
	
	public List<Student> buscarTodos(){
		Query query = (Query) this.manager.createQuery(" SELECT e FROM Student e ");
		return query.getResultList();
		
	}
	
	public static void main(String[] args){
	
		// Busca todos registros
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
		EntityManager manager = factory.createEntityManager();
		EstudanteRepository estudanteRepository = new EstudanteRepository(manager);
		List<Student> estudantes = estudanteRepository.buscarTodos();
		for (Student e : estudantes) {
			System.out.println("RA: " +e.getId()+ " | Estudantes: " +e.getSname()+ " | Curso: " +e.getScourse()+ " | Turma:  " +e.getSroll());			
		}
		// Fim buscar todos.
		
		// Adiciona item.
		Student e = new Student();
		e.setSname("Kleber Gracia Soares");
		e.setScourse("CComput");
		e.setSroll(1);
		estudanteRepository.adicionar(e);
		manager.getTransaction().begin();
		manager.getTransaction().commit();
		// Fim adicionar.
		
		// Update nos dados
		e = manager.find(Student.class, 5L);
		e.setScourse("C.Comput");
		manager.getTransaction().begin();
		manager.getTransaction().commit();
		manager.close();
		factory.close();

		
		
		
		
	}
}
