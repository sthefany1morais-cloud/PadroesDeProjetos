package exercicios.ex07.decorator.bebida;

import java.util.List;

public class ChocolateQuente implements Bebida{

    String nome;
    String descricao;
    Double custo;
    Double custoAdicionais;
    Double custoBase;
    List<String> adicionais;

    public ChocolateQuente() {
        this.nome = "Chocolate Quente";
        this.descricao = "Uma xícara de chocolate quente, feita com leite e cacau em pó, perfeita para os dias frios.";
        this.custoBase = 7.0;
        this.custoAdicionais = 0.0;
        this.custo = custoBase + custoAdicionais;
        this.adicionais = new java.util.ArrayList<>();
    }

    @Override
    public String getDescricao() {
        StringBuilder sb = new StringBuilder();
        sb.append("nome: ").append(nome).append("\n");
        sb.append(descricao).append("\n");;
        if (!getAdicionais().isEmpty()) {
            sb.append("Adicionais:\n");
            for (String adicional : getAdicionais()) {
                sb.append("- ").append(adicional).append("\n");
            }
        }
        sb.append("\nCusto base: R$ ").append(getCustoBase());
        sb.append("\nCusto getAdicionais: R$ ").append(getCustoAdicionais());
        sb.append("\nCusto total: R$ ").append(getCusto());
        return sb.toString();
    }

    @Override
    public double getCusto() {
        return custo;
    }

    public String getNome() {
        return nome;
    }

    public Double getCustoAdicionais() {
        return custoAdicionais;
    }

    public Double getCustoBase() {
        return custoBase;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCustoAdicionais(Double custoAdicionais) {
        this.custoAdicionais = custoAdicionais;
        this.custo = custoBase + custoAdicionais;
    }

    public void setCustoBase(Double custoBase) {
        this.custoBase = custoBase;
        this.custo = custoBase + custoAdicionais;
    }

    @Override
    public String preparar() {
        return "Preparando " + nome + "...";
    }

    @Override
    public String servir() {
        return "Servindo " + nome + "...";
    }

    @Override
    public String beber() {
        return "Bebendo " + nome + "...";
    }

    @Override
    public java.util.List<String> getAdicionais() {
        return adicionais;
    }

    @Override
    public java.util.List<String> adicionarAdicional(String adicional) {
        if (adicionais == null) {
            adicionais = new java.util.ArrayList<>();
        }
        adicionais.add(adicional);
        return adicionais;
    }
}