package exercicios.ex19.Iterator;

import java.util.List;

public class FilaAtendimentoIterator implements IteratorSenha {

    private List<SenhaAtendimento> senhas;
    private int posicaoAtual;

    public FilaAtendimentoIterator(List<SenhaAtendimento> senhas) {
        this.senhas = senhas;
        this.posicaoAtual = 0;
    }

    @Override
    public boolean temProxima() {
        return posicaoAtual < senhas.size();
    }

    @Override
    public SenhaAtendimento proxima() {
        if (!temProxima()) {
            throw new IndexOutOfBoundsException("Não há mais senhas para atender.");
        }
        SenhaAtendimento senha = senhas.get(posicaoAtual);
        posicaoAtual++;
        return senha;
    }
}
