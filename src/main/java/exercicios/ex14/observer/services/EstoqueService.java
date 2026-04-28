package exercicios.ex14.observer.services;

import exercicios.ex14.observer.observer.PedidoObserver;
import exercicios.ex14.observer.pedido.Pedido;

public class EstoqueService implements PedidoObserver {
    @Override
    public void atualizar(Pedido pedido) {
        switch (pedido.getStatus()) {
            case PAGO:
                System.out.println("ESTOQUE: Reservando itens do pedido " + pedido.getId());
                break;
            case CANCELADO:
                System.out.println("ESTOQUE: Devolvendo itens ao estoque do pedido " + pedido.getId());
                break;
            default:
                break;
        }
    }
}