package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

//Observer
public class EnviarEmailPedido implements AcaoAposGerarPedido {
	
	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Enviar email com dados do novo pedido");
	}
	
}
