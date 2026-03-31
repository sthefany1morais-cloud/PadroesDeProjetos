package exercicios.ex10.composite;

public class Produto implements ItemLoja {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public void exibir(String prefixo) {
        System.out.println(prefixo + "- Produto: " + getNome() + " | Preço: R$" + preco);
    }
}
