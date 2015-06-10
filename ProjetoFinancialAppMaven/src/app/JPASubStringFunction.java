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
public class JPASubStringFunction {

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
			Query query=em.createQuery("UPDATE Student st SET st.sname=SUBSTRING('vinod kumar',1,5) WHERE st.sname='vinod kumar'");
			int updateRecord=query.executeUpdate();
			System.out.println(updateRecord+" reocrds are updated");
			entr.commit();
		}
		finally{
			em.close();
		}

	}

}
