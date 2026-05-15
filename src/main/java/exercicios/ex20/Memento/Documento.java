package exercicios.ex20.Memento;

public class Documento {
    private  String titulo;
    private String conteudo;
    private String autor;
    private String dataUltimaAlteracao;

    public Documento(String titulo, String conteudo, String autor) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.autor = autor;
        this.dataUltimaAlteracao = java.time.LocalDateTime.now().toString();
    }

    public void editarTitulo(String novoTitulo) {
        this.titulo = novoTitulo;
        this.dataUltimaAlteracao = java.time.LocalDateTime.now().toString();
        System.out.println("\n Título editado com sucesso! \n");
        exibirDocumento();
    }

    public void editarConteudo(String novoConteudo) {
        this.conteudo = novoConteudo;
        this.dataUltimaAlteracao = java.time.LocalDateTime.now().toString();
        System.out.println("\n Conteúdo editado com sucesso! \n");
        exibirDocumento();
    }

    public void editarAutor(String novoAutor) {
        this.autor = novoAutor;
        this.dataUltimaAlteracao = java.time.LocalDateTime.now().toString();
        System.out.println("\n Autor editado com sucesso! \n");
        exibirDocumento();
    }

    public MementoDocumento salvarEstado() {
        System.out.println("\n Estado salvo com sucesso! \n");
        return new MementoDocumento(titulo, conteudo, autor, dataUltimaAlteracao);
    }

    public void restaurarEstado(MementoDocumento memento) {
        this.titulo = memento.getTitulo();
        this.conteudo = memento.getConteudo();
        this.autor = memento.getAutor();
        this.dataUltimaAlteracao = memento.getDataUltimaAlteracao();

        System.out.println("\n Estado restaurado com sucesso! \n");
        exibirDocumento();
    }

    public void exibirDocumento() {
        System.out.println("Título: " + titulo);
        System.out.println("Conteúdo: " + conteudo);
        System.out.println("Autor: " + autor);
        System.out.println("Data da Última Alteração: " + dataUltimaAlteracao);
    }
}