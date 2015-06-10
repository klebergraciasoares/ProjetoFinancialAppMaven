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
public class JPATrimFunction {

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
			Query query=em.createQuery("SELECT st FROM Student st");
			List stuList=query.getResultList();
			Iterator stuIterator=stuList.iterator();
			while(stuIterator.hasNext()){
				Student st=(Student)stuIterator.next();
				System.out.print("sname:"+st.getSname());
				System.out.println();
			}
			//TIRM
			Query trimQuery=em.createQuery("UPDATE Student st SET st.sname=TRIM(st.sname)");
			int updateRecord=trimQuery.executeUpdate();
			System.out.println(updateRecord+" records are updated");
			entr.commit();
		}
		finally{
			em.close();
		}

	}

}
