package exercicios.ex13.strategy.estrategia;

public class PagamentoPix implements PagamentoStrategy {

    public PagamentoPix() {
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
        System.out.println("Desconto aplicado: 5% ");
        System.out.println("Taxa fixa aplicada: R$ 2,00 ");
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
