package exercicios.ex21.Mediator;

public class Recepcao {
    boolean salaCheia = false;
    MediadorClinica central;

    public Recepcao() {
    }

    public void setCentral(MediadorClinica central) {
        this.central = central;
    }

    public void iniciarAtendimento(Paciente paciente) {
        System.out.println("Recepção: Iniciando atendimento...");
        central.iniciarAtendimento(paciente);
    }

    public boolean isSalaCheia() {
        return salaCheia;
    }

    public void setSalaCheia(boolean salaCheia) {
        this.salaCheia = salaCheia;
    }
}


