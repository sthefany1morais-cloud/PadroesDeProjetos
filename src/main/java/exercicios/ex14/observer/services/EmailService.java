package exercicios.ex14.observer.services;


import exercicios.ex14.observer.observer.PedidoObserver;
import exercicios.ex14.observer.pedido.Pedido;

public class EmailService implements PedidoObserver{
    @Override
    public void atualizar(Pedido pedido) {
        System.out.println("EMAIL: Cliente " + pedido.getCliente().getNome() + " avisado sobre status " + pedido.getStatus());
    }
}