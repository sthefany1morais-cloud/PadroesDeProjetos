package exercicios.ex16.command;

import java.util.*;

public class GerenciadorTarefas {
    private List<Tarefa> tarefas;

    public GerenciadorTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void removerTarefa(Tarefa tarefa) {
        tarefas.remove(tarefa);
    }

    public void concluirTarefa(Tarefa tarefa) {
        if (!tarefa.isConcluida()) {
            tarefa.concluir();
        }
    }

    public void concluirTarefa(int posicao) {
        if (posicao >= 0 && posicao < tarefas.size()) {
            tarefas.get(posicao).concluir();
        }
    }

    public void concluirTarefa(String descricao) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getDescricao().equals(descricao)) {
                tarefa.concluir();
                break;
            }
        }
    }

    public void reabrirTarefa(Tarefa tarefa) {
        if (tarefa.isConcluida()) {
            tarefa.concluir();
        }
    }

    public void exibirTarefas() {
        for (int i = 0; i < tarefas.size(); i++) {
            Tarefa tarefa = tarefas.get(i);
            String status = tarefa.isConcluida() ? "Concluída" : "Pendente";
            System.out.println((i + 1) + ". " + tarefa.getDescricao() + " - " + status);
        }
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

}