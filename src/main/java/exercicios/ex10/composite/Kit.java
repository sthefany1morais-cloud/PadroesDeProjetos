package exercicios.ex10.composite;

import java.util.ArrayList;
import java.util.List;

public class Kit implements ItemLoja {

    private String nome;
    private List<ItemLoja> itens;

    public Kit(String nome) {
        this.nome = nome;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemLoja item) {
        itens.add(item);
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        double total = 0;
        for (ItemLoja item : itens) {
            total += item.getPreco();
        }
        return total;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setItens(List<ItemLoja> itens) {
        this.itens = itens;
    }

    @Override
    public void exibir(String prefixo) {
        System.out.println(prefixo + "+ Kit: " + getNome() + " | Preço Total: R$" + getPreco());
        for (ItemLoja item : itens) {
            item.exibir(prefixo + "  ");
        }
    }
}
