package exercicios.ex16.command;

public class AdicionarTarefaCommand implements Command {
    private Tarefa tarefa;
    private GerenciadorTarefas gerenciador;

    public AdicionarTarefaCommand(Tarefa tarefa, GerenciadorTarefas gerenciador) {
        this.tarefa = tarefa;
        this.gerenciador = gerenciador;
    }

    @Override
    public void execute() {
        gerenciador.adicionarTarefa(tarefa);
        System.out.println("Tarefa adicionada: " + tarefa.getDescricao());
    }

    @Override
    public void undo() {
        gerenciador.removerTarefa(tarefa);
        System.out.println("Desfazendo último comando...");
        System.out.println("Tarefa removida: " + tarefa.getDescricao());
    }
}
