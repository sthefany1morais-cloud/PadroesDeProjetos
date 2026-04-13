package exercicios.ex13.strategy.estrategia;

public class PagamentoBoleto implements PagamentoStrategy {
    public PagamentoBoleto() {
    }

    @Override
    public double calcularTotal(double valor) {
        double valorTotal = descontarPagamento(valor, 5) + 2;
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
            throw new RuntimeException("Valor total do boleto deve ser maior que zero.");
        }

        else if (valor > 2000) {
            throw new RuntimeException("Valor total do boleto não pode exceder R$ 2000,00.");
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