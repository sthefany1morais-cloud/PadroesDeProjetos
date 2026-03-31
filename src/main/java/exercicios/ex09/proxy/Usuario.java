package exercicios.ex09.proxy;

public class Usuario {
    private String nome;
    private Plano plano;

    public Usuario(String nome, Plano plano) {
        this.nome = nome;
        this.plano = plano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }
}
