package exercicios.ex13.strategy.estrategia;

public class PagamentoCartao implements PagamentoStrategy {

    public PagamentoCartao() {
    }

    @Override
    public double calcularTotal(double valor) {
        return taxarPagamento(valor, 5);
    }

    private double calcularPercentualTaxa(double valor, double percentual) {
        return (valor / 100) * percentual;
    }

    @Override
    public double taxarPagamento(double valor, double percentual) {
        return valor + calcularPercentualTaxa(valor, percentual);
    }

    @Override
    public double descontarPagamento(double valor, double percentual) {
        return valor - calcularPercentualTaxa(valor, percentual);
    }
}
