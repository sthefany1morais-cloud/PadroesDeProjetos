package exercicios.ex16.command;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PainelControle {

    //STACK --> PILHA --> LIFO (O ÚLTIMO A ENTRAR, É O PRIMEIRO A SAIR (SER DESFEITO))
    private Stack<Command> historico = new Stack<>();
    //LINKEDLIST --> LISTA ENCADEADA --> FIFO (O PRIMEIRO COMANDO QUE ENTROU SERÁ O PRIMEIRO A SER EXECUTADO)
    private Queue<Command> fila = new LinkedList<>();

    public void executarComando(Command command) {
        command.execute();
        historico.push(command);
    }

    public void desfazerUltimoComando() {
        if (!historico.isEmpty()) {
            Command ultimoComando = historico.pop();
            ultimoComando.undo();
        }
    }

    public void adicionarNaFila(Command command) {
        fila.add(command);
        System.out.println("Comando adicionado à fila.");
    }

    public void removerDaFila(Command command) {
        fila.remove(command);
    }

    public void processarFila() {
        while (!fila.isEmpty()) {
            Command comando = fila.poll();
            comando.execute();
            historico.push(comando);
        }
    }


}