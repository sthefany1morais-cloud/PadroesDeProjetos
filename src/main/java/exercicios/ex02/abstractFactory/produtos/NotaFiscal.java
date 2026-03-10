package exercicios.ex02.abstractFactory.produtos;

import java.util.List;

public interface NotaFiscal {

    public String emitirIndividual(String pedidoId, double quantidade);
    public void emitirTotal(List<String> pedidosId, List<Integer> quantidade, double valor);
}
