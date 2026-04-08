package exercicios.ex13.strategy.estrategia;

public interface PagamentoStrategy {

    void pagar(double valor);

    void relatorioPagamento();

    void validarPagamento() throws RuntimeException;

}
