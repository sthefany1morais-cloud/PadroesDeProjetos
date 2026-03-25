package exercicios.ex07.decorator.decorador;

import exercicios.ex07.decorator.bebida.Bebida;

import java.util.List;

public class CaldaChocolateDecorator implements Bebida {

    private Bebida bebida;

    public CaldaChocolateDecorator(Bebida bebida) {
        bebida.setCustoAdicionais(bebida.getCustoAdicionais() + 2.50);
        bebida.adicionarAdicional("Calda de Chocolate");
        this.bebida = bebida;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao();
    }

    @Override
    public double getCusto() {
        return bebida.getCusto();
    }

    @Override
    public String preparar() {
        return bebida.preparar();
    }

    @Override
    public String servir() {
        return bebida.servir();
    }

    @Override
    public String beber() {
        return bebida.beber();
    }

    @Override
    public List<String> getAdicionais() {
        return bebida.getAdicionais();
    }

    @Override
    public String getNome() {
        return bebida.getNome();
    }

    @Override
    public Double getCustoAdicionais() {
        return bebida.getCustoAdicionais();
    }

    @Override
    public Double getCustoBase() {
        return bebida.getCustoBase();
    }

    @Override
    public void setNome(String nome) {
        bebida.setNome(nome);
    }

    @Override
    public void setDescricao(String descricao) {
        bebida.setDescricao(descricao);
    }

    @Override
    public void setCustoAdicionais(Double custoAdicionais) {
        bebida.setCustoAdicionais(custoAdicionais);
    }

    @Override
    public void setCustoBase(Double custoBase) {
        bebida.setCustoBase(custoBase);
    }

    @Override
    public List<String> adicionarAdicional(String adicional) {
        return bebida.adicionarAdicional(adicional);
    }
}
