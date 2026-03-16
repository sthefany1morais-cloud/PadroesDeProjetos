package exercicios.ex03.builder;

import exercicios.ex03.builder.enums.Tamanho;
import exercicios.ex03.builder.enums.Tipo;
import exercicios.ex03.builder.enums.TipoMassa;
import exercicios.ex03.builder.enums.TipoPao;

public class ItemBuilder {
    private String nome;
    private Tipo tipo;
    private Tamanho tamanho;
    private Float preco;
    private TipoMassa tipoMassa;
    private TipoPao tipoPao;

    public void addNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("O nome do item não pode ser vazio.");
        }
        this.nome = nome;
    }

    public void addTipo(Tipo tipo) {
        if (tipo == null) {
            throw new IllegalArgumentException("O tipo do item deve ser especificado.");
        }
        this.tipo = tipo;
    }

    public void addTamanho(Tamanho tamanho) {
        if (tamanho == null) {
            throw new IllegalArgumentException("O tamanho do item deve ser especificado.");
        }
        this.tamanho = tamanho;
    }

    public void addPreco(Float preco) {
        Float precoTotal = preco;
        if (preco == null || preco < 0) {
            throw new IllegalArgumentException("O preço do item deve ser um valor positivo.");
        }
        if (tipoMassa == TipoMassa.MASSA_RECHEADA) {
            precoTotal += 5; // Adiciona um valor extra para massas recheadas
        }
        this.preco = preco;
    }

    public void addTipoMassa(TipoMassa tipoMassa) {
        if (this.tipo != Tipo.PIZZA) {
            throw new IllegalArgumentException("O tipo de massa só pode ser definido para itens do tipo PIZZA.");
        }
        this.tipoMassa = tipoMassa;
    }

    public void addTipoPao(TipoPao tipoPao) {
        if (this.tipo != Tipo.SANDUICHE && this.tipo != Tipo.HAMBURGUER) {
            throw new IllegalArgumentException("O tipo de pão só pode ser definido para itens do tipo SANDUICHE ou HAMBURGUER.");
        }
        this.tipoPao = tipoPao;
    }

    public Item build() {
        if (nome == null || tipo == null || tamanho == null || preco == null) {
            throw new IllegalStateException("Todos os campos obrigatórios devem ser preenchidos para construir o item.");
        }
        return new Item(nome, tipo, tamanho, preco, tipoMassa, tipoPao);
    }
}
