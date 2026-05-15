package exercicios.ex21.Mediator;

public class Enfermagem {
    boolean enfermagemDisponivel = true;
    MediadorClinica central;

    public Enfermagem() {
    }

    public void setCentral(MediadorClinica central) {
        this.central = central;
    }

    public void prestarCuidados(String tipoCuidados) {
        System.out.println("Enfermagem: Prestando cuidados ao paciente...");
        central.realizarAcaoEnfermagem(tipoCuidados);
    }

    public boolean isEnfermagemDisponivel() {
        return enfermagemDisponivel;
    }

    public void setEnfermagemDisponivel(boolean enfermagemDisponivel) {
        this.enfermagemDisponivel = enfermagemDisponivel;
    }
}
