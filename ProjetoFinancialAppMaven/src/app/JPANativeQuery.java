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
public class JPANativeQuery {

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
			Query query=em.createNativeQuery("SELECT sname FROM Student");
			List stList=query.getResultList();
			Iterator stIterator=stList.iterator();
			while(stIterator.hasNext()){
				System.out.print("sname:"+stIterator.next());
				System.out.println();
			}
			entr.commit();
		}
		finally{
			em.close();
		}
	}

}
