package exercicios.ex16.command;

public class RemoverUltimaTarefaCommand implements Command {

    private Tarefa ultimaTarefa;
    private GerenciadorTarefas gerenciador;

    public RemoverUltimaTarefaCommand(GerenciadorTarefas gerenciador) {
        this.ultimaTarefa = null;
        this.gerenciador = gerenciador;
    }

    @Override
    public void execute() {
        if (!gerenciador.getTarefas().isEmpty()) {
            this.ultimaTarefa = gerenciador.getTarefas().get(gerenciador.getTarefas().size() - 1);
            gerenciador.removerTarefa(this.ultimaTarefa);
                System.out.println("Última tarefa removida: " + this.ultimaTarefa.getDescricao());
        }
    }

    @Override
    public void undo() {
        gerenciador.adicionarTarefa(this.ultimaTarefa);
        System.out.println("Desfazendo último comando...");
        System.out.println("Última tarefa restaurada: " + this.ultimaTarefa.getDescricao());
    }
}