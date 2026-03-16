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

        // Criando pizza com ItemBuilder
        ItemBuilder pizzaBuilder = new ItemBuilder();
        pizzaBuilder.addNome("Pizza Calabresa");
        pizzaBuilder.addTipo(Tipo.PIZZA);
        pizzaBuilder.addTamanho(Tamanho.GRANDE);
        pizzaBuilder.addTipoMassa(TipoMassa.MASSA_RECHEADA);
        pizzaBuilder.addPreco(40f);

        Item pizza = pizzaBuilder.build();

        // Criando hambúrguer com ItemBuilder
        ItemBuilder hamburguerBuilder = new ItemBuilder();
        hamburguerBuilder.addNome("Hamburguer Artesanal");
        hamburguerBuilder.addTipo(Tipo.HAMBURGUER);
        hamburguerBuilder.addTamanho(Tamanho.MEDIO);
        hamburguerBuilder.addTipoPao(TipoPao.BAGUETE);
        hamburguerBuilder.addPreco(25f);

        Item hamburguer = hamburguerBuilder.build();

        // Lista de itens
        List<Item> itens = new ArrayList<>();
        itens.add(pizza);
        itens.add(hamburguer);

        // Criando pedido com PedidoBuilder
        PedidoBuilder pedidoBuilder = new PedidoBuilder();
        pedidoBuilder.addCliente("João");
        pedidoBuilder.addItens(itens);
        pedidoBuilder.addFormaPagamento(FormaPagamento.DINHEIRO);
        pedidoBuilder.addEntrega(Entrega.DELIVERY);
        pedidoBuilder.addEnderecoEntrega("Rua A, 123");
        pedidoBuilder.adicionarTroco(50f);
        pedidoBuilder.addCupomDesconto(5f);

        Pedido pedido = pedidoBuilder.build();

        System.out.println("Pedido criado com sucesso");
    }
}