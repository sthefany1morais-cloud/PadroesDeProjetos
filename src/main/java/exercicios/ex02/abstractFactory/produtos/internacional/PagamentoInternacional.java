package exercicios.ex02.abstractFactory.produtos.internacional;

import exercicios.ex02.abstractFactory.produtos.Pagamento;

public class PagamentoInternacional implements Pagamento {

    @Override
    public boolean Pagar(double valorTotal, double valorPago) {
        return valorPago >= valorTotal;
    }
}