package exercicios.ex03.builder;

import exercicios.ex03.builder.enums.Entrega;
import exercicios.ex03.builder.enums.FormaPagamento;

import java.util.List;

public class PedidoBuilder {
    private String cliente;
    private List<Item> itens;
    private List<String> adicionais;
    private List<String> observacoes;
    private FormaPagamento formaPagamento;
    private Float cupomDesconto;
    private Entrega entrega;
    private String enderecoEntrega;
    private Float troco;
    private Float valorTotal;

    public void addCliente(String cliente) {
        if (cliente == null || cliente.isEmpty()) {
            throw new IllegalArgumentException("O nome do cliente não pode ser vazio.");
        }
        this.cliente = cliente;
    }

    public void adicionarItem(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("O item não pode ser nulo.");
        }
        this.itens.add(item);
    }

    public void addItens(List<Item> itens) {
        if (itens == null || itens.isEmpty()) {
            throw new IllegalArgumentException("A lista de itens não pode ser vazia.");
        }

        if (this.itens == null) {
            this.itens = new java.util.ArrayList<>();
        }

        this.itens.addAll(itens);
    }

    public void addAdicionais(List<String> adicionais) {
        this.adicionais = adicionais;
    }

    public void addObservacoes(List<String> observacoes) {
        this.observacoes = observacoes;
    }

    public void addFormaPagamento(FormaPagamento formaPagamento) {
        if (formaPagamento == null) {
            throw new IllegalArgumentException("A forma de pagamento deve ser especificada.");
        }
        this.formaPagamento = formaPagamento;
    }

    public void addCupomDesconto(Float cupomDesconto) {
        if (cupomDesconto < 0) {
            throw new IllegalArgumentException("O valor do cupom de desconto deve ser um valor positivo.");
        }
        this.cupomDesconto = cupomDesconto;
    }

    public void addEntrega(Entrega entrega) {
        if (entrega == null) {
            throw new IllegalArgumentException("A forma de entrega deve ser especificada.");
        }
        this.entrega = entrega;
    }

    public void addEnderecoEntrega(String enderecoEntrega) {
        if (this.entrega == Entrega.DELIVERY && (enderecoEntrega == null || enderecoEntrega.isEmpty())) {
            throw new IllegalArgumentException("O endereço de entrega deve ser fornecido para pedidos com entrega.");
        }
        this.enderecoEntrega = enderecoEntrega;
    }

    public void adicionarTroco(Float troco) {
        if (this.formaPagamento == FormaPagamento.DINHEIRO && (troco == null || troco < 0)) {
            throw new IllegalArgumentException("O valor do troco deve ser um valor positivo para pagamentos em dinheiro.");
        } else if (this.formaPagamento != FormaPagamento.DINHEIRO && troco != null) {
            throw new IllegalArgumentException("O valor do troco só deve ser definido para pagamentos em dinheiro.");
        }
        this.troco = troco;
    }

    private void calcularValorTotal() {
        float total = 0;
        for (Item item : itens) {
            total += item.getPreco();
        }
        this.valorTotal = total;
    }

    public Pedido build(){
        if (formaPagamento.equals(FormaPagamento.DINHEIRO)){
            if (troco < 0) {
                throw new IllegalArgumentException("O valor do troco deve ser um valor positivo para pagamentos em dinheiro.");
            }
        } else {
            if (troco != null) {
                throw new IllegalArgumentException("O valor do troco só deve ser definido para pagamentos em dinheiro.");
            }
        }
        calcularValorTotal();

        if (cupomDesconto != null) {
            valorTotal -= cupomDesconto;
        }

        return new Pedido(cliente, itens, adicionais, observacoes, formaPagamento, cupomDesconto, entrega, enderecoEntrega, troco, valorTotal);
    }
}
