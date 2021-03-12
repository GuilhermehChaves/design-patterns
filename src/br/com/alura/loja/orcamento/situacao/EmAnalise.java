package br.com.alura.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

//State
public class EmAnalise extends SituacaoOrcamento {
	
	@Override
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.02"));
	}
	
	@Override
	public void aprovar(Orcamento orcamento) {
		orcamento.setSituacao(new Aprovado());
	}
	
	@Override
	public void reprovar(Orcamento orcamento) {
		orcamento.setSituacao(new Reprovado());
	}
}