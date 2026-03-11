package exercicios.ex03.builder;

import exercicios.ex03.builder.enums.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public class Pedido {
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
    private TipoMassa tipoMassa;
    private TipoPao tipoPao;

    public Pedido(String cliente, List<Item> itens, List<String> adicionais, List<String> observacoes, FormaPagamento formaPagamento, Float cupomDesconto, Entrega entrega, String enderecoEntrega, Float troco, Float valorTotal) {
        this.cliente = cliente;
        this.itens = itens;
        this.adicionais = adicionais;
        this.observacoes = observacoes;
        this.formaPagamento = formaPagamento;
        this.cupomDesconto = cupomDesconto;
        this.entrega = entrega;
        this.enderecoEntrega = enderecoEntrega;
        this.troco = troco;
        this.valorTotal = valorTotal;
    }
}
