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

    public void setCliente(String cliente) {
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

    public void setAdicionais(List<String> adicionais) {
        this.adicionais = adicionais;
    }

    public void setObservacoes(List<String> observacoes) {
        this.observacoes = observacoes;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        if (formaPagamento == null) {
            throw new IllegalArgumentException("A forma de pagamento deve ser especificada.");
        }
        this.formaPagamento = formaPagamento;
    }

    public void setCupomDesconto(Float cupomDesconto) {
        this.cupomDesconto = cupomDesconto;
    }

    public void setEntrega(Entrega entrega) {
        if (entrega == null) {
            throw new IllegalArgumentException("A forma de entrega deve ser especificada.");
        }
        this.entrega = entrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        if (this.entrega == Entrega.DELIVERY && (enderecoEntrega == null || enderecoEntrega.isEmpty())) {
            throw new IllegalArgumentException("O endereço de entrega deve ser fornecido para pedidos com entrega.");
        }
        this.enderecoEntrega = enderecoEntrega;
    }

    public void setTroco(Float troco) {
        if (this.formaPagamento == FormaPagamento.DINHEIRO && (troco == null || troco < 0)) {
            throw new IllegalArgumentException("O valor do troco deve ser um valor positivo para pagamentos em dinheiro.");
        } else if (this.formaPagamento != FormaPagamento.DINHEIRO && troco != null) {
            throw new IllegalArgumentException("O valor do troco só deve ser definido para pagamentos em dinheiro.");
        }
        this.troco = troco;
    }

    public Pedido build(){
        return new Pedido(cliente, itens, adicionais, observacoes, formaPagamento, cupomDesconto, entrega, enderecoEntrega, troco, valorTotal);
    }
}
