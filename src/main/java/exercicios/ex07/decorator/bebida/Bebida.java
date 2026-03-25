package exercicios.ex07.decorator.bebida;

import java.util.List;

public interface Bebida {

    String getDescricao();
    double getCusto();
    String preparar();
    String servir();
    String beber();
    List<String> getAdicionais();
    List<String> adicionarAdicional(String adicional);
    String getNome();
    Double getCustoAdicionais();
    Double getCustoBase();
    void setNome(String nome);
    void setDescricao(String descricao);
    void setCustoAdicionais(Double custoAdicionais);
    void setCustoBase(Double custoBase);
}
