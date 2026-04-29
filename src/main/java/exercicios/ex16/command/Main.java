package exercicios.ex16.command;

public class Main {
    public static void main(String[] args) {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        PainelControle painelControle = new PainelControle();
        GerenciadorTarefas gerenciadorTarefas = new GerenciadorTarefas();
        // Etapa 1 — execução imediata
        painelControle.adicionarNaFila(new AdicionarTarefaCommand(new Tarefa("Estudar Command"), gerenciador));
        painelControle.adicionarNaFila(new AdicionarTarefaCommand(new Tarefa("Implementar exercício"), gerenciador));
        painelControle.adicionarNaFila(new ConcluirTarefaCommand(new Tarefa("Estudar Command"), gerenciador));
        painelControle.processarFila();
        System.out.println();
        // Etapa 2 — desfazer
        painelControle.desfazerUltimoComando();
        System.out.println();
        // Etapa 3 — fila
        painelControle.adicionarNaFila(new AdicionarTarefaCommand(new Tarefa("Revisar Observer"), gerenciador));
        painelControle.adicionarNaFila(new AdicionarTarefaCommand(new Tarefa("Estudar Chain of Responsibility"), gerenciador));
        painelControle.adicionarNaFila(new ConcluirTarefaCommand(new Tarefa("Implementar exercício"), gerenciador));
        painelControle.processarFila();
        // Etapa 4 — exibição final
        System.out.println("\nEstado final da lista de tarefas:");
        gerenciador.exibirTarefas();
    }
}
//Não é possivel deixar a saída exatamente igual ao exemplo
// devido a mensagem 'Comando adicionado na fila.' ser exibida antes do comando ser processado,
// como no exemplo inicialmente a mensagem do aviso é exibida no processar mas não aparece o
// 'Comando adicionado na fila.' antes do comando ser processado, o que causa a diferença na saída.