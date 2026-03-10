package exercicios.ex02.abstractFactory.service;

import exercicios.ex02.abstractFactory.fornecedores.FornecedorFactory;
import exercicios.ex02.abstractFactory.produtos.Frete;
import exercicios.ex02.abstractFactory.produtos.NotaFiscal;
import exercicios.ex02.abstractFactory.produtos.Pagamento;

import java.util.List;

public class CheckoutService {

    private final Pagamento pagamento;
    private final Frete frete;
    private final NotaFiscal notaFiscal;

    public CheckoutService(FornecedorFactory factory) {
        this.pagamento = factory.criarPagamento();
        this.frete = factory.criarFrete();
        this.notaFiscal = factory.criarNotaFiscal();
    }

    public void finalizarCompra(List<String> pedidosId,
                                List<Integer> quantidade,
                                double valorProdutos,
                                double pesoKg,
                                String cepDestino,
                                double valorPago) {

        double valorTotal = frete.calcularFrete(pesoKg, cepDestino);
        if (pagamento.Pagar(valorTotal, valorPago)){
            notaFiscal.emitirTotal(pedidosId, quantidade, valorTotal);
            System.out.println("Valor Pago: " + valorPago);
            System.out.println("Obrigado e volte sempre!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
