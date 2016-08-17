package br.com.larimaia.model;

public class Endereco {
	private String bairro;
	private String lagradouro;
	private String cep;
	private String complemento;
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getLagradouro() {
		return lagradouro;
	}
	public void setLagradouro(String lagradouro) {
		this.lagradouro = lagradouro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
}
