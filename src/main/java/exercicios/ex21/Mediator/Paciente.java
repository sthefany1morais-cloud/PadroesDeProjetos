package exercicios.ex21.Mediator;

public class Paciente {

    boolean pacienteChegou = false;
    MediadorClinica mediator;

    public Paciente() {
    }

    public void setMediator(MediadorClinica mediator) {
        this.mediator = mediator;
    }

    public void solicitarAtendimento() {
        System.out.println("Paciente: Solicitando atendimento...");
        mediator.solicitarAtendimento();
    }

    public boolean isPacienteChegou() {
        return pacienteChegou;
    }

    public void setPacienteChegou(boolean pacienteChegou) {
        this.pacienteChegou = pacienteChegou;
    }
}
