package exercicios.ex14.observer.services;

import exercicios.ex14.observer.observer.PedidoObserver;
import exercicios.ex14.observer.pedido.Pedido;

public class FaturamentoService implements PedidoObserver {
    @Override
    public void atualizar(Pedido pedido) {
        switch (pedido.getStatus()) {
            case PAGO:
                System.out.println("FATURAMENTO: Gerando lançamento financeiro do pedido " + pedido.getId());
                break;
            case CANCELADO:
                System.out.println("FATURAMENTO: Estornando valores do pedido " + pedido.getId());
                break;
            default:
                break;
        }
    }
}