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
public class JPAGetSingleResult {

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
			Query query = em.createQuery("SELECT st FROM Student st WHERE st.sroll = :roll");
			query.setParameter("roll", 101);
			Student st = (Student) query.getSingleResult();
			System.out.print("sname:"+st.getSname());
			System.out.print(" sroll:"+st.getSroll());
			System.out.print(" scourse:"+st.getScourse());
			entr.commit();
		}
		finally{
			em.close();
		}

	}

}
