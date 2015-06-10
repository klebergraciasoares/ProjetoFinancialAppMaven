package cursojpajsfk19.vo;

import java.io.Serializable;

public class AbstractCrudBeanListagemFiltroVO implements Serializable {

	private String nomeCampoFiltro;
	private String filtro;
	private String nomeCampoOrdenacao;

	public AbstractCrudBeanListagemFiltroVO(String nomeCampo, String filtro,
			String nomeCampoOrdenacao) {
		this.nomeCampoFiltro = nomeCampo;
		this.filtro = filtro;
		this.nomeCampoOrdenacao = nomeCampoOrdenacao;
	}

	public String getNomeCampoFiltro() {
		return nomeCampoFiltro;
	}

	public String getFiltro() {
		if (filtro != null) {
			return filtro.toUpperCase();
		} else {
			return filtro;
		}
	}

	public String getNomeCampoOrdenacao() {
		return nomeCampoOrdenacao;
	}

}
