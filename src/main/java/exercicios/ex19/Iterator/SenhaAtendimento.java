package exercicios.ex19.Iterator;

public class SenhaAtendimento {
    private String id;
    private String nome;
    private TipoAtendimento tipo;

    public SenhaAtendimento(String id, String nome, TipoAtendimento tipo) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoAtendimento getTipo() {
        return tipo;
    }

    public void setTipo(TipoAtendimento tipo) {
        this.tipo = tipo;
    }
}