package exercicios.ex02.abstractFactory.produtos.nacional;

import exercicios.ex02.abstractFactory.produtos.NotaFiscal;

import java.util.List;

public class NotaFiscalNacional implements NotaFiscal {
    @Override
    public String emitirIndividual(String pedidoId, double quantidade) {
        return pedidoId +"- " +"Quantidade: " +quantidade;
    }
    @Override
    public void emitirTotal(List<String> pedidosId, List<Integer> quantidade, double valor) {
        for (int i =0; i <pedidosId.size(); i++){
            System.out.println(emitirIndividual(pedidosId.get(i), quantidade.get(i)));
        }
        System.out.println("\nValor: U$ "+ valor);
    }
}
