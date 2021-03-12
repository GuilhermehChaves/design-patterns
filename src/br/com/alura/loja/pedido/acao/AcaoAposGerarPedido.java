package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

//Observer
public interface AcaoAposGerarPedido {
	public void executarAcao(Pedido pedido);
}
