package exercicios.ex21.Mediator;

public class Laboratorio {
    boolean laboratorioDisponivel = true;
    MediadorClinica central;

    public Laboratorio() {
    }

    public void setCentral(MediadorClinica central) {
        this.central = central;
    }

    public void realizarExame(String tipoExame) {
        System.out.println("Laboratório: Realizando exame...");
        central.realizarExame(tipoExame);
    }

    public boolean isLaboratorioDisponivel() {
        return laboratorioDisponivel;
    }

    public void setLaboratorioDisponivel(boolean laboratorioDisponivel) {
        this.laboratorioDisponivel = laboratorioDisponivel;
    }
}
