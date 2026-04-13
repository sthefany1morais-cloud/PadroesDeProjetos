package exercicios.ex13.strategy.estrategia;

public class PagamentoBoleto implements PagamentoStrategy {
    public PagamentoBoleto() {
    }

    @Override
    public double calcularTotal(double valor) {
        return descontarPagamento(valor, 5) + 2;
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