package exercicios.ex13.strategy.estrategia;

public class PagamentoCartao implements PagamentoStrategy {

    public PagamentoCartao() {
    }

    @Override
    public double calcularTotal(double valor) {
        double valorTotal = taxarPagamento(valor, 5);
        validarPagamento(valorTotal);
        return valorTotal;
    }

    @Override
    public void pagar(double valor) {
        double valorTotal = calcularTotal(valor);
        System.out.println("Pagamento realizado com cartão.");
        relatorioPagamento(valorTotal);
    }

    @Override
    public void relatorioPagamento(double valor) {
        System.out.println("Taxa aplicada: 5% ");
        System.out.println("Valor total: R$ " + valor);
    }

    @Override
    public void validarPagamento(double valor) throws RuntimeException{
        if (valor <= 0) {
            throw new RuntimeException("Valor total do cartão deve ser maior que zero.");
        }

        else if (valor > 5000) {
            throw new RuntimeException("Valor total do cartão não pode exceder R$ 5000,00.");
        }
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
