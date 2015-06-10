package app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPAListaRegistroProduto {

	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("jpa");

		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery(" SELECT p FROM Product p ");
		List<Product> produtos = query.getResultList();

//		for (Product p : produtos) {
//			Product produtoInsereNovoRegistro = new Product();
//
//			System.out.println("Produto: " + p.getItemName() + " | Preço: "
//					+ p.getPrice());
//			produtoInsereNovoRegistro
//					.setItemName("Bombril para ariar panela. ");
//			produtoInsereNovoRegistro.setPrice(5.58);
//
//			manager.persist(produtoInsereNovoRegistro);
//			manager.getTransaction().begin();
//			manager.getTransaction().commit();
//
//		}
		
		Product produtoInsere = new Product();
        StringBuffer sql = new StringBuffer();
        sql.append("insert into product (itemName, price)");
        sql.append("select id,  itemName, price ");
        sql.append(" from Product ");
        sql.append("where id = 1 ");		
		
//        produtoInsere.setItemName("1");
//        produtoInsere.setPrice(10.0);
        
        manager.createNativeQuery(sql.toString())
        .setParameter(1, produtoInsere.getId())
        .setParameter(2, produtoInsere.getItemName())
        .setParameter(3, produtoInsere.getPrice())
        .executeUpdate();
        
        

		manager.close();
		factory.close();

	}
}
