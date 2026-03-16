package exercicios.ex03.builder;

import exercicios.ex03.builder.enums.Tamanho;
import exercicios.ex03.builder.enums.Tipo;
import exercicios.ex03.builder.enums.TipoMassa;
import exercicios.ex03.builder.enums.TipoPao;

public class Item {
    private String nome;
    private Tipo tipo;
    private Tamanho tamanho;
    private Float preco;
    private TipoMassa tipoMassa;
    private TipoPao tipoPao;

    public Item(String nome, Tipo tipo, Tamanho tamanho, Float preco, TipoMassa tipoMassa, TipoPao tipoPao) {
        this.nome = nome;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.preco = preco;
        this.tipoMassa = tipoMassa;
        this.tipoPao = tipoPao;
    }

    public Float getPreco() {
        return preco;
    }
}
