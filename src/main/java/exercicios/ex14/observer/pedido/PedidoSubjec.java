package exercicios.ex14.observer.pedido;

import exercicios.ex14.observer.observer.PedidoObserver;

public interface PedidoSubjec {
    void adicionarObserver(PedidoObserver observer);
    void removerObserver(PedidoObserver observer);
    void notificarObservers();
    void atualizarStatus(StatusPedido novoStatus);
}
