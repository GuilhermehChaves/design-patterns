package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.imposto.CalculadoraDeImposto;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesImposto {
	// Strategy
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(BigDecimal.TEN));
		
		CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
		
		//System.out.println(calculadora.calcular(orcamento, new ICMS()));
		//System.out.println(calculadora.calcular(orcamento, new ISS()));
	}

}
