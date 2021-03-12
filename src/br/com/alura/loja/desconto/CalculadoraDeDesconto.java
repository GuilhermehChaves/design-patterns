package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeDesconto {
	
	public BigDecimal calcular(Orcamento orcamento) {	
		Desconto cadeiaDeDescontos = new OrcamentoComMaisDeCincoItens(
				new OrcamentoComValorMaiorQueQuinhentos(
						new SemDesconto()));

		return cadeiaDeDescontos.efetuarCalculo(orcamento);
	}
}
