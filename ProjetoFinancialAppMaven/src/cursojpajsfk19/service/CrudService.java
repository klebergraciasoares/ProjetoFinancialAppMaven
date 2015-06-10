package cursojpajsfk19.service;

import java.util.List;

import cursojpajsfk19.vo.AbstractCrudBeanListagemFiltroVO;

/**
 * Serviços base para qualquer dominio
 * 
 * @author codex
 * @param <T> 
 * @version 1.0
 */
public interface CrudService<T> {  

    T criar(T entity);
    T atualizar(T entity);
    public void remover(T entity);
    public T obter(Object id);

    public List<T> listar(int[] intervalo);
    public int contar();
    
    List<T> listar(int[] intervalo, AbstractCrudBeanListagemFiltroVO listagemFiltroVO);
    int contar(AbstractCrudBeanListagemFiltroVO listagemFiltroVO);
    
}
