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
    private Float valorPago;

    public Pedido(String cliente, List<Item> itens, List<String> adicionais, List<String> observacoes, FormaPagamento formaPagamento, Float cupomDesconto, Entrega entrega, String enderecoEntrega, Float troco, Float valorTotal, Float valorPago) {
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
        this.valorPago = valorPago;
    }

    public void imprimirNotaFiscal() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Itens:");
        for (Item item : itens) {
            System.out.println("- " + item.getPreco());
        }
        System.out.println("Adicionais: " + adicionais);
        System.out.println("Observações: " + observacoes);
        System.out.println("Forma de Pagamento: " + formaPagamento);
        System.out.println("Cupom de Desconto: " + cupomDesconto);
        System.out.println("Entrega: " + entrega);
        System.out.println("Endereço de Entrega: " + enderecoEntrega);
        System.out.println("valor Pago: " + valorPago);
        System.out.println("Troco: " + troco);
        System.out.println("Valor Total: " + valorTotal);
    }
}
