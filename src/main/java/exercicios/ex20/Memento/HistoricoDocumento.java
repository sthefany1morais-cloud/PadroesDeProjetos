package exercicios.ex20.Memento;

import java.util.Stack;

public class HistoricoDocumento {

    private Stack<MementoDocumento> historico;

    public HistoricoDocumento() {
        this.historico = new Stack<>();
    }

    public void salvarEstado(Documento documento) {
        MementoDocumento memento = documento.salvarEstado();
        historico.push(memento);
    }

    public MementoDocumento desfazer() {
        if (!historico.isEmpty()) {
            return historico.pop();
        }
        return null;
    }
}