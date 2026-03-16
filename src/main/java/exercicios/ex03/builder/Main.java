package exercicios.ex03.builder;

import exercicios.ex03.builder.Item;
import exercicios.ex03.builder.ItemBuilder;
import exercicios.ex03.builder.Pedido;
import exercicios.ex03.builder.PedidoBuilder;
import exercicios.ex03.builder.enums.Entrega;
import exercicios.ex03.builder.enums.FormaPagamento;
import exercicios.ex03.builder.enums.Tamanho;
import exercicios.ex03.builder.enums.Tipo;
import exercicios.ex03.builder.enums.TipoMassa;
import exercicios.ex03.builder.enums.TipoPao;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Criando pizza usando ItemBuilder
        ItemBuilder pizzaBuilder = new ItemBuilder();
        pizzaBuilder.setNome("Pizza Calabresa");
        pizzaBuilder.setTipo(Tipo.PIZZA);
        pizzaBuilder.setTamanho(Tamanho.GRANDE);
        pizzaBuilder.setTipoMassa(TipoMassa.MASSA_RECHEADA);
        pizzaBuilder.setPreco(40f);

        Item pizza = pizzaBuilder.build();

        // Criando hamburguer usando ItemBuilder
        ItemBuilder hamburguerBuilder = new ItemBuilder();
        hamburguerBuilder.setNome("Hamburguer Artesanal");
        hamburguerBuilder.setTipo(Tipo.HAMBURGUER);
        hamburguerBuilder.setTamanho(Tamanho.MEDIO);
        hamburguerBuilder.setTipoPao(TipoPao.BAGUETE);
        hamburguerBuilder.setPreco(25f);

        Item hamburguer = hamburguerBuilder.build();

        // Lista de itens
        List<Item> itens = new ArrayList<>();
        itens.add(pizza);
        itens.add(hamburguer);

        // Criando pedido usando PedidoBuilder
        PedidoBuilder pedidoBuilder = new PedidoBuilder();
        pedidoBuilder.setCliente("João");
        pedidoBuilder.addItens(itens);
        pedidoBuilder.setFormaPagamento(FormaPagamento.DINHEIRO);
        pedidoBuilder.setEntrega(Entrega.DELIVERY);
        pedidoBuilder.setEnderecoEntrega("Rua A, 123");
        pedidoBuilder.adicionarTroco(50f);
        pedidoBuilder.setCupomDesconto(5f);

        Pedido pedido = pedidoBuilder.build();

        System.out.println("Pedido criado com sucesso.");
    }
}