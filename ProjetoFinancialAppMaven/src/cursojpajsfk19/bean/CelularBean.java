package cursojpajsfk19.bean;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import cursojpajsfk19.entitys.Celular;
import cursojpajsfk19.repository.interfaces.CelularRepository;
import cursojpajsfk19.vo.AbstractCrudBeanListagemFiltroVO;

public class CelularBean implements CelularRepository { 

	private EntityManager manager;

	private CelularBean(EntityManager manager) {
		this.manager = manager;
	}

	@Override
	public Celular criar(Celular c) {
		this.manager.persist(c);
		return null;
	}

	@Override
	public Celular atualizar(Celular entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remover(Celular entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public Celular obter(Object id) {
		return this.manager.find(Celular.class, id);
	}

	@Override
	public List<Celular> listar(int[] intervalo) {
		Query query = (Query) this.manager
				.createQuery(" SELECT c FROM Celular c ");
		return query.getResultList();
	}

	@Override
	public int contar() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Celular> listar(int[] intervalo,
			AbstractCrudBeanListagemFiltroVO listagemFiltroVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int contar(AbstractCrudBeanListagemFiltroVO listagemFiltroVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("jpa");

		EntityManager manager = factory.createEntityManager();

		Celular novoCelular = new Celular();
		novoCelular.setNumber("3233-0315");

		manager.persist(novoCelular);
		manager.getTransaction().begin();
		manager.getTransaction().commit();
	}

}
