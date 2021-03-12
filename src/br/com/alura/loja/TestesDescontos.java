package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDesconto;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesDescontos {
	//Chain of responsibility
	public static void main(String[] args) {
		Orcamento primeiro = new Orcamento();
		primeiro.adicionarItem(new ItemOrcamento(BigDecimal.TEN));
		
		Orcamento segundo = new Orcamento();
		segundo.adicionarItem(new ItemOrcamento(BigDecimal.TEN));
		
		CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();
		
		System.out.println(calculadora.calcular(primeiro));
		System.out.println(calculadora.calcular(segundo));
	}

}
