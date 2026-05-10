package exercicios.ex19.Iterator;

public class Main {
    public static void main(String[] args) {
        FilaAtendimento fila = new FilaAtendimento(new java.util.ArrayList<>());

        fila.adicionarSenha(new SenhaAtendimento("001", "João", TipoAtendimento.NORMAL));
        fila.adicionarSenha(new SenhaAtendimento("002", "Maria", TipoAtendimento.PRIORITARIO));
        fila.adicionarSenha(new SenhaAtendimento("003", "Carlos", TipoAtendimento.NORMAL));
        fila.adicionarSenha(new SenhaAtendimento("004", "Ana", TipoAtendimento.PRIORITARIO));
        fila.adicionarSenha(new SenhaAtendimento("005", "Pedro", TipoAtendimento.NORMAL));

        FilaAtendimentoIterator iterator = fila.criarIterator();

        while (iterator.temProxima()) {
            SenhaAtendimento senha = iterator.proxima();
            fila.chamar(senha);
        }
    }
}