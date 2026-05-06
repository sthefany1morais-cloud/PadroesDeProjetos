package exercicios.ex17.State;

public class Main {
    public static void main(String[] args) {
        Chamado chamado1 = new Chamado("001", "Problema no computador", "João"); // Criar um chamado com código, descrição e solicitante.
        chamado1.resolver(); // Tentar resolver o chamado ainda aberto.
        chamado1.iniciarAtendimento(); // Iniciar atendimento.
        chamado1.aguardarCliente(); // Colocar o chamado como aguardando cliente.
        chamado1.resolver(); // Tentar resolver enquanto aguarda cliente.
        chamado1.responderCliente(); // Registrar resposta do cliente.
        chamado1.resolver(); // Resolver o chamado.
        chamado1.cancelar(); // Tentar cancelar depois de resolvido.

        System.out.println("\n---\n");

        Chamado chamado2 = new Chamado("002", "Problema na impressora", "Maria"); // Criar um segundo chamado
        chamado2.cancelar(); // Cancelar o segundo chamado ainda aberto.
        chamado2.iniciarAtendimento(); // Tentar iniciar atendimento no chamado cancelado.
    }
}