package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

//Composite
public class ItemOrcamento implements Orcavel{
	private BigDecimal valor;

	public ItemOrcamento(BigDecimal valor) {
		super();
		this.valor = valor;
	}
	
	@Override
	public BigDecimal getValor() {
		return valor;
	}
}
