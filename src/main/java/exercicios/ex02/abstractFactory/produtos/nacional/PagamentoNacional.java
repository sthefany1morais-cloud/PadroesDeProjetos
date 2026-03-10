package exercicios.ex02.abstractFactory.produtos.nacional;

import exercicios.ex02.abstractFactory.produtos.Pagamento;

public class PagamentoNacional implements Pagamento {

    @Override
    public boolean Pagar(double valorTotal, double valorPago) {
        return valorPago >= valorTotal;
    }
}
