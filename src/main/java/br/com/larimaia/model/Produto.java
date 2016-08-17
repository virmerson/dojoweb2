package br.com.larimaia.model;

import java.math.BigDecimal;

public class Produto {
	private long id;
	private String descrisao;
	private BigDecimal valor;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescrisao() {
		return descrisao;
	}
	public void setDescrisao(String descrisao) {
		this.descrisao = descrisao;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
}
