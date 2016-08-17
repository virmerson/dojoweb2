package br.com.larimaia.model;

import java.math.BigDecimal;
import java.util.Date;

public class Pedido {
	private long id;
	private Cliente cliente;
	private Date dataPedido;
	private Date dataEntrega;
	private Endereco enderecoEntrega;
	private BigDecimal valorTotal;
	private Cerimonial cerimonial;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Date getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}
	public Date getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	public Endereco getEnderecoEntrega() {
		return enderecoEntrega;
	}
	public void setEnderecoEntrega(Endereco enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Cerimonial getCerimonial() {
		return cerimonial;
	}
	public void setCerimonial(Cerimonial cerimonial) {
		this.cerimonial = cerimonial;
	}
	
}
