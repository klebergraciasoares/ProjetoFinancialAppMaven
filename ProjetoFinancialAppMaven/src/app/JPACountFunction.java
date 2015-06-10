package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * @author Administrator
 *
 */
public class JPACountFunction {

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
			Query query=em.createQuery("SELECT COUNT(p.itemName) FROM Product p");
			Number countResult=(Number) query.getSingleResult();
			System.out.println("Count result:"+countResult);
			entr.commit();
		}
		finally{
			em.close();
		}
	}

}