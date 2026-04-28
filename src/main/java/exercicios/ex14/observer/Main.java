package exercicios.ex14.observer;

import exercicios.ex14.observer.cliente.Cliente;
import exercicios.ex14.observer.pedido.Pedido;
import exercicios.ex14.observer.pedido.StatusPedido;
import exercicios.ex14.observer.services.*;

public class Main {
    public static void main(String[] args) {
        // Criar um cliente
        Cliente cliente = new Cliente("Miquéias", "miqueis.professor@gmail.com");

        // Criar um pedido com id e status inicial
        Pedido pedido = new Pedido("PED-001", StatusPedido.CRIADO, cliente);

        // Registrar todos os observers
        pedido.adicionarObserver(new EmailService());
        pedido.adicionarObserver(new LogService());
        pedido.adicionarObserver(new DashboardService());
        pedido.adicionarObserver(new EstoqueService());
        pedido.adicionarObserver(new FaturamentoService());

        // Executar as seguintes mudanças de status, nesta ordem
        pedido.atualizarStatus(StatusPedido.PAGO);
        System.out.println();
        pedido.atualizarStatus(StatusPedido.EM_SEPARACAO);
        System.out.println();
        pedido.atualizarStatus(StatusPedido.ENVIADO);
        System.out.println();
        pedido.atualizarStatus(StatusPedido.CANCELADO);
        System.out.println();
        pedido.atualizarStatus(StatusPedido.ENTREGUE);
    }
}