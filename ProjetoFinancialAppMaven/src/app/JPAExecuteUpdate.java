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
public class JPAExecuteUpdate {

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
			Query query = em.createQuery("DELETE FROM Student st WHERE st.sroll= ?1");
			query.setParameter(1, 104);
			int noOf_delete_record = query.executeUpdate();
			System.out.println(noOf_delete_record+" record is deleted");
			entr.commit();
		}
		finally{
			em.close();
		}
	}

}
