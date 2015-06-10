package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAInsereRegistroProduto {

	public static void main(String[] args){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
		
		EntityManager manager = factory.createEntityManager();
		
		Product produtoInsereNovoRegistro = new Product();
		
		produtoInsereNovoRegistro.setItemName("Bombril para ariar panela. ");
		produtoInsereNovoRegistro.setPrice(5.58);
		
		manager.persist(produtoInsereNovoRegistro);
		manager.getTransaction().begin();
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
				
	}
}
