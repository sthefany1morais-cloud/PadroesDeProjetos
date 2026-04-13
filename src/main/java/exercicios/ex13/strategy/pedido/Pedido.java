package exercicios.ex13.strategy.pedido;

import exercicios.ex13.strategy.estrategia.PagamentoStrategy;

public class Pedido {
    private double valor;
    private PagamentoStrategy pagamento;

    public Pedido(double valor, PagamentoStrategy pagamento) {
        this.valor = valor;
        this.pagamento = pagamento;
    }

    public void alterarEstrategia(PagamentoStrategy novaEstrategia) {
        this.pagamento = novaEstrategia;
    }

    public double calcularTotal(){
        return pagamento.calcularTotal(this.valor);
    }
}
