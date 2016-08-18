package br.com.larimaia.model;

import javax.persistence.Embeddable;

@Embeddable
public class Endereco {
	
	private String bairro;
	private String lagradouro;
	private String cep;
	private String complemento;
	
	public Endereco() {
		// TODO Auto-generated constructor stub
	}

	public Endereco(String bairro, String lagradouro, String cep, String complemento) {
		super();
		this.bairro = bairro;
		this.lagradouro = lagradouro;
		this.cep = cep;
		this.complemento = complemento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((cep == null) ? 0 : cep.hashCode());
		result = prime * result + ((complemento == null) ? 0 : complemento.hashCode());
		result = prime * result + ((lagradouro == null) ? 0 : lagradouro.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (cep == null) {
			if (other.cep != null)
				return false;
		} else if (!cep.equals(other.cep))
			return false;
		if (complemento == null) {
			if (other.complemento != null)
				return false;
		} else if (!complemento.equals(other.complemento))
			return false;
		if (lagradouro == null) {
			if (other.lagradouro != null)
				return false;
		} else if (!lagradouro.equals(other.lagradouro))
			return false;
		return true;
	}
	
	
}
