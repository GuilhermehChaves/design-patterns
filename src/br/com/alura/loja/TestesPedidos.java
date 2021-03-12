package br.com.alura.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.LogDePedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

//Command
public class TestesPedidos {

	public static void main(String[] args) {
		String cliente = "Yasmim";
		BigDecimal valor = new BigDecimal("700");
		int quantidade = 2;
		
		GeraPedido dados = new GeraPedido(cliente, valor, quantidade);
		
		GeraPedidoHandler handler = new GeraPedidoHandler(
				//Observer
				Arrays.asList(
						new SalvarPedidoNoBancoDeDados(), 
						new EnviarEmailPedido(), 
						new LogDePedido()
				)
		);
		
		//Facade
		handler.execute(dados);
	}
}
