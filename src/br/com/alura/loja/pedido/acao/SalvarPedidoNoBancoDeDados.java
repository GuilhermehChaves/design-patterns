package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

//Observer
public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido {
	
	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Salvar no banco de dados");
	}
}
