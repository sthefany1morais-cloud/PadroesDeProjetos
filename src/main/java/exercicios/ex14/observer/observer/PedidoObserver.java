package exercicios.ex14.observer.observer;

import exercicios.ex14.observer.pedido.Pedido;

public interface PedidoObserver {
    void atualizar(Pedido pedido);
}
