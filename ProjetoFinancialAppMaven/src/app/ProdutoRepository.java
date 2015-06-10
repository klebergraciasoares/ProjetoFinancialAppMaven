package app;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.EntityManager;

public class ProdutoRepository {

	private EntityManager manager;
	
	public ProdutoRepository(EntityManager manager){
		this.manager = manager;
	}

	public void adicionar(Product p){
		this.manager.persist(p);
	}
	
	public Product buscar(Long id){
		return this.manager.find(Product.class, id);
	}
	
	public List<Product> buscarTodos(){
		Query query = (Query) this.manager.createQuery(" SELECT p FROM Product p ");
		return query.getResultList();
		
	}
	
	public static void main(String[] args){
	
		// Busca todos registros
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
		EntityManager manager = factory.createEntityManager();
		ProdutoRepository produtoRepository = new ProdutoRepository(manager);
		List<Product> produtos = produtoRepository.buscarTodos();
		for (Product p : produtos) {
			System.out.println("Produto: " +p.getItemName()+ " | Preço: " +p.getPrice());			
		}
		// Fim buscar todos.
		
		// Adiciona item.
		Product p = new Product();
		p.setItemName("Pedal Caloi 10. ");
		p.setPrice(320.50);
		produtoRepository.adicionar(p);
		manager.getTransaction().begin();
		manager.getTransaction().commit();
//		manager.close(); // 
//		factory.close();
		// Fim adicionar.
		
		// Update nos dados
		p = manager.find(Product.class, 1L);
		p.setItemName("Pasta com fluor");
		manager.getTransaction().begin();
		manager.getTransaction().commit();
		manager.close();
		factory.close();
		
		
		
		
	}
}
