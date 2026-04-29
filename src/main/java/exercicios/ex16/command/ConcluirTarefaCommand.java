package exercicios.ex16.command;

public class ConcluirTarefaCommand implements Command {
    private Tarefa tarefa;
    private GerenciadorTarefas gerenciador;

    public ConcluirTarefaCommand(Tarefa tarefa, GerenciadorTarefas gerenciador) {
        this.tarefa = tarefa;
        this.gerenciador = gerenciador;
    }

    public void execute() {
        gerenciador.concluirTarefa(tarefa);
        System.out.println("Tarefa concluída: " + tarefa.getDescricao());
    }

    public void undo() {
        gerenciador.reabrirTarefa(tarefa);
        System.out.println("Desfazendo último comando...");
        System.out.println("Tarefa voltou para pendente: " + tarefa.getDescricao());
    }
}
