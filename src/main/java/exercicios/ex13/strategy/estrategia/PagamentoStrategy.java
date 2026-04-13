package exercicios.ex13.strategy.estrategia;

public interface PagamentoStrategy {

    void pagar(double valor);

    void relatorioPagamento(double valor);

    void validarPagamento(double valor) throws RuntimeException;

    double taxarPagamento(double valor, double percentual);

    double descontarPagamento(double valor, double percentual);
}
