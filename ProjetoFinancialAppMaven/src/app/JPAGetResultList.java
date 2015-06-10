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
public class JPAGetResultList {

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
			Query query = em.createQuery("SELECT st FROM Student st WHERE st.sroll > ?1");
			query.setParameter(1, 101);
			List results = query.getResultList();
			if(results.size()!=0){
				Iterator stIterator=results.iterator();
				while(stIterator.hasNext()){
					Student st=(Student)stIterator.next();
					System.out.print("sname:"+st.getSname());
					System.out.print(" sroll:"+st.getSroll());
					System.out.print(" scourse:"+st.getScourse());
					System.out.println();
				}
			}
			else{
				System.out.println("Record not found.");
			}
			entr.commit();
		}
		finally{
			em.close();
		}

	}

}
