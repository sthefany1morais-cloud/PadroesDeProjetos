package exercicios.ex14.observer.services;

import exercicios.ex14.observer.observer.PedidoObserver;
import exercicios.ex14.observer.pedido.Pedido;

public class LogService implements PedidoObserver {
    @Override
    public void atualizar(Pedido pedido) {
        System.out.println("LOG: Pedido " + pedido.getId() + " alterado para " + pedido.getStatus());
    }
}