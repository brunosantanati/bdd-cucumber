package me.brunosantana.bdd.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Lance {

	private Long id;
	private BigDecimal valor;
	private LocalDate data;
	private Usuario usuario;
	private Leilao leilao;

	@Deprecated
	public Lance() {}
	
	public Lance(Usuario usuario, BigDecimal valor) {
		if (valor.doubleValue() <= 0) {
			throw new IllegalArgumentException();
		}
		this.usuario = usuario;
		this.valor = valor;
		this.data = LocalDate.now();
	}

	public Lance(BigDecimal valor) {
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Leilao getLeilao() {
		return leilao;
	}

	public void setLeilao(Leilao leilao) {
		this.leilao = leilao;
	}

}
