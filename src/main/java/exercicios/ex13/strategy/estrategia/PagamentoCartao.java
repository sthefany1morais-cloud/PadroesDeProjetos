package exercicios.ex13.strategy.estrategia;

public class PagamentoCartao implements PagamentoStrategy {

    private double taxa;
    private double valorTotal;

    public PagamentoCartao() {
        this.taxa = 5;
        this.valorTotal = 0.0;
    }

    @Override
    public void pagar(double valor) {
        this.valorTotal = valor + taxa;
        validarPagamento();
        System.out.println("Pagamento realizado com cartão.");
        relatorioPagamento();
    }

    @Override
    public void relatorioPagamento() {
        System.out.println("Taxa aplicada: R$ " + taxa);
        System.out.println("Valor total: R$ " + valorTotal);
    }

    @Override
    public void validarPagamento() throws RuntimeException{
        if (valorTotal <= 0) {
            throw new RuntimeException("Valor total do cartão deve ser maior que zero.");
        }

        else if (valorTotal > 2000) {
            throw new RuntimeException("Valor total do cartão não pode exceder R$ 2000,00.");
        }
    }

    private void taxar(double percentual) {
        if (percentual < 0 || percentual > 100) {
            throw new IllegalArgumentException("Percentual de taxa deve ser entre 0 e 100.");
        }
        double taxa = valorTotal * (percentual / 100);
        this.valorTotal = valorTotal + taxa;
    }

    private void desconto(double percentual) {
        if (percentual < 0 || percentual > 100) {
            throw new IllegalArgumentException("Percentual de desconto deve ser entre 0 e 100.");
        }
        double desconto = valorTotal * (percentual / 100);
        this.valorTotal -= desconto;
    }
}
