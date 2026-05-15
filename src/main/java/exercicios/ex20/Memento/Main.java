package exercicios.ex20.Memento;

public class Main {
    public static void main(String[] args) {
        Documento documento = new Documento("Meu Documento", "Conteúdo inicial", "Autor A");
        HistoricoDocumento historico = new HistoricoDocumento();

        // Exibir estado inicial
        System.out.println("Estado Inicial:");
        documento.exibirDocumento();

        // Salvar primeira versão
        historico.salvarEstado(documento);

        // Alterar conteúdo do documento
        documento.editarConteudo("Conteúdo alterado - Versão 2");

        // Salvar nova versão
        historico.salvarEstado(documento);

        // Fazer nova alteração
        documento.editarConteudo("Conteúdo alterado novamente - Versão 3");

        // Exibir estado atual
        System.out.println("\nEstado Atual:");
        documento.exibirDocumento();

        // Restaurar versão anterior
        MementoDocumento mementoAnterior = historico.desfazer();
        documento.restaurarEstado(mementoAnterior);

        MementoDocumento mementoMaisAntigo = historico.desfazer();
        documento.restaurarEstado(mementoMaisAntigo);

    }
}