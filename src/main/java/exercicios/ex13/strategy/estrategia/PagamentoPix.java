package exercicios.ex13.strategy.estrategia;

public class PagamentoPix implements PagamentoStrategy {

    private double taxa;
    private double valorTotal;

    public PagamentoPix() {
        this.taxa = 0.00;
        this.valorTotal = 0.0;
    }

    @Override
    public void pagar(double valor) {
        this.valorTotal = valor + taxa;
        System.out.println("Pagamento realizado com Pix.");
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
            throw new RuntimeException("Valor total do pix deve ser maior que zero.");
        }

        else if (valorTotal > 1500) {
            throw new RuntimeException("Valor total do pix não pode exceder R$ 1500,00.");
        }
    }

    @Override
    private void desconto(double percentual) {
        if (percentual < 0 || percentual > 100) {
            throw new IllegalArgumentException("Percentual de desconto deve ser entre 0 e 100.");
        }
        double desconto = valorTotal * (percentual / 100);
        this.valorTotal -= desconto;
    }

}
