package exercicios.ex03.builder;

import exercicios.ex03.builder.enums.Tamanho;
import exercicios.ex03.builder.enums.Tipo;

public class Item {
    private String nome;
    private Tipo tipo;
    private Tamanho tamanho;
    private Float preco;

    public Item(String nome, Tipo tipo, Tamanho tamanho, Float preco) {
        this.nome = nome;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.preco = preco;
    }
}
