package exercicios.ex13.strategy.estrategia;

public class PagamentoPix implements PagamentoStrategy {

    public PagamentoPix() {
    }

    @Override
    public double calcularTotal(double valor) {
        return descontarPagamento(valor, 10);
    }

    @Override
    public void pagar(double valor) {
        double valorTotal = calcularTotal(valor);
        validarPagamento(valorTotal);
        System.out.println("Pagamento realizado com cartão.");
        relatorioPagamento(valorTotal);
    }

    @Override
    public void relatorioPagamento(double valor) {
        System.out.println("Desconto aplicado: 10% ");
        System.out.println("Valor total: R$ " + valor);
    }

    @Override
    public void validarPagamento(double valor) throws RuntimeException{
        if (valor <= 0) {
            throw new RuntimeException("Valor total do pix deve ser maior que zero.");
        }

        else if (valor > 4000) {
            throw new RuntimeException("Valor total do pix não pode exceder R$ 4000,00.");
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
