package exercicios.ex13.strategy.estrategia;

public class PagamentoPix implements PagamentoStrategy {

    public PagamentoPix() {
    }

    @Override
    public double calcularTotal(double valor) {
        return descontarPagamento(valor, 10);
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
