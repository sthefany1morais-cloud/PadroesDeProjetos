package exercicios.ex14.observer.services;

import exercicios.ex14.observer.observer.PedidoObserver;
import exercicios.ex14.observer.pedido.Pedido;

public class DashboardService implements PedidoObserver {
    @Override
    public void atualizar(Pedido pedido) {
        System.out.println("DASHBOARD: Atualizando painel do pedido " + pedido.getId() + " com status " + pedido.getStatus());
    }
}