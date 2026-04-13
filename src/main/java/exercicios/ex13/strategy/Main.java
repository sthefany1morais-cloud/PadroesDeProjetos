package exercicios.ex13.strategy;

import exercicios.ex13.strategy.estrategia.PagamentoBoleto;
import exercicios.ex13.strategy.estrategia.PagamentoCartao;
import exercicios.ex13.strategy.estrategia.PagamentoPix;
import exercicios.ex13.strategy.pedido.Pedido;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cenario 1: Pedido de R$ 200 com cartão");
        Pedido pedidoCartao = new Pedido(200, new PagamentoCartao());
        System.out.println("Pagamento com Cartão: R$ " + pedidoCartao.calcularTotal());

        System.out.println("\nCenario 2: Pedido de R$ 200 com Pix");
        Pedido pedidoPix = new Pedido(200, new PagamentoPix());
        System.out.println("Pagamento com Pix: R$ " + pedidoPix.calcularTotal());

        System.out.println("\nCenario 3: Pedido de R$ 200 com boleto");
        Pedido pedidoBoleto = new Pedido(200, new PagamentoBoleto());
        System.out.println("Pagamento com Boleto: R$ " + pedidoBoleto.calcularTotal());

        System.out.println("\nCenario 4: Pedido de R$ 200 com cartão, depois trocar para Pix");
        System.out.println("\nAlterando forma de pagamento...");
        pedidoCartao.alterarEstrategia(new PagamentoPix());
        System.out.println("Novo total com Pix: R$ " + pedidoCartao.calcularTotal());

    }
}