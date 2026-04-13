package exercicios.ex13.strategy.estrategia;

public interface PagamentoStrategy {

    double calcularTotal(double valor);

    double taxarPagamento(double valor, double percentual);

    double descontarPagamento(double valor, double percentual);
}
