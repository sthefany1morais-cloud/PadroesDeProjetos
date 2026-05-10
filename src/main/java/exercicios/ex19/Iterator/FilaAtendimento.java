package exercicios.ex19.Iterator;

import java.util.List;

public class FilaAtendimento {

    private List<SenhaAtendimento> senhas;

    public FilaAtendimento(List<SenhaAtendimento> senhas) {
        this.senhas = senhas;
    }

    public void adicionarSenha(SenhaAtendimento senha) {
        senhas.add(senha);
    }

    public void removerSenha(SenhaAtendimento senha) {
        senhas.remove(senha);
    }

    public FilaAtendimentoIterator criarIterator() {
        return new FilaAtendimentoIterator(senhas);
    }

    public void chamar(SenhaAtendimento senha) {
        System.out.println("Chamando senha: " + senha.getId() + " - " + senha.getNome() + " - " + senha.getTipo());
    }
}
