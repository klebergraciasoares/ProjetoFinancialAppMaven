package cursojpajsfk19.entitys;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cliente {

	@Id
	@GeneratedValue
	private String codigo;

	private Date data_cadastro;
	private String razao_social;
	private String cpf;
	private String rg;
	private String endereco;
	private String bairro;
	private String cidade;
	private String cep;
	private String uf;
	private String contato;
	private String telefone;
	private String email;
	private String observacao;
	private String ativo;
	private String agencia;
	private String banco;
	private String conta;
	private String beneficio;
	private String celular;
	private String emissor;
	private Date data_nascimento;
	private String tipo_de_conta;
	private String agenciador;
	private String tipo_emprestimo;
	private String telefone2;
	private String graduacao;
	private String senha_inss;
	private String sexo;
	private String pai;
	private String mae;
	private String data_contato;
	private String operador;
	private String data_retorno;
	private String assunto;
	private String ligacao_futura;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Date getData_cadastro() {
		return data_cadastro;
	}

	public void setData_cadastro(Date data_cadastro) {
		this.data_cadastro = data_cadastro;
	}

	public String getRazao_social() {
		return razao_social;
	}

	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getAtivo() {
		return ativo;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getBeneficio() {
		return beneficio;
	}

	public void setBeneficio(String beneficio) {
		this.beneficio = beneficio;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmissor() {
		return emissor;
	}

	public void setEmissor(String emissor) {
		this.emissor = emissor;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getTipo_de_conta() {
		return tipo_de_conta;
	}

	public void setTipo_de_conta(String tipo_de_conta) {
		this.tipo_de_conta = tipo_de_conta;
	}

	public String getAgenciador() {
		return agenciador;
	}

	public void setAgenciador(String agenciador) {
		this.agenciador = agenciador;
	}

	public String getTipo_emprestimo() {
		return tipo_emprestimo;
	}

	public void setTipo_emprestimo(String tipo_emprestimo) {
		this.tipo_emprestimo = tipo_emprestimo;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public String getGraduacao() {
		return graduacao;
	}

	public void setGraduacao(String graduacao) {
		this.graduacao = graduacao;
	}

	public String getSenha_inss() {
		return senha_inss;
	}

	public void setSenha_inss(String senha_inss) {
		this.senha_inss = senha_inss;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getPai() {
		return pai;
	}

	public void setPai(String pai) {
		this.pai = pai;
	}

	public String getMae() {
		return mae;
	}

	public void setMae(String mae) {
		this.mae = mae;
	}

	public String getData_contato() {
		return data_contato;
	}

	public void setData_contato(String data_contato) {
		this.data_contato = data_contato;
	}

	public String getOperador() {
		return operador;
	}

	public void setOperador(String operador) {
		this.operador = operador;
	}

	public String getData_retorno() {
		return data_retorno;
	}

	public void setData_retorno(String data_retorno) {
		this.data_retorno = data_retorno;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getLigacao_futura() {
		return ligacao_futura;
	}

	public void setLigacao_futura(String ligacao_futura) {
		this.ligacao_futura = ligacao_futura;
	}

}
