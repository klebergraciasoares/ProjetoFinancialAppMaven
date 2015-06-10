package app;

import java.util.ArrayList;
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
public class JPANamedParameterList {

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
			List snames=new ArrayList();
			snames.add("Ravi");
			snames.add("Vinod");
			snames.add("suman11");
			Query query=em.createQuery("SELECT st FROM Student st WHERE st.sname IN (:snameList)");
			query.setParameter("snameList", snames);
			List stList=query.getResultList();
			Iterator stIterator=stList.iterator();
			while(stIterator.hasNext()){
				Student st=(Student)stIterator.next();
				System.out.print("id:"+st.getId());
				System.out.print(" sname:"+st.getSname());
				System.out.print(" sroll:"+st.getSroll());
				System.out.print(" scourse:"+st.getScourse());
				System.out.println();
			}
			entr.commit();
		}
		finally{
			em.close();
		}

	}

}
