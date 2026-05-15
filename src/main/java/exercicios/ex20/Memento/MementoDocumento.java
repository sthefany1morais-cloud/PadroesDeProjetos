package exercicios.ex20.Memento;

public class MementoDocumento {
    private  String titulo;
    private String conteudo;
    private String autor;
    private String dataUltimaAlteracao;

    public MementoDocumento(String titulo, String conteudo, String autor, String dataUltimaAlteracao) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.autor = autor;
        this.dataUltimaAlteracao = dataUltimaAlteracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public String getAutor() {
        return autor;
    }

    public String getDataUltimaAlteracao() {
        return dataUltimaAlteracao;
    }
}
