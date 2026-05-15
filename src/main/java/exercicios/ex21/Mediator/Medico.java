package exercicios.ex21.Mediator;

public class Medico {
    boolean exameSolicitado = false;
    MediadorClinica mediator;

    public Medico() {
    }

    public void setMediator(MediadorClinica mediator) {
        this.mediator = mediator;
    }

    public void solicitarExame(String tipoExame) {
        System.out.println("Médico: Solicitando exame...");
        mediator.solicitarExame(tipoExame);
    }

    public void soliciarEnfermagem(CentralAtendimentoClinica mediator, String tipoSolicitacao) {
        System.out.println("Médico: Solicitando enfermagem...");
        mediator.solicitarEnfermagem(tipoSolicitacao);
    }

    public boolean isExameSolicitado() {
        return exameSolicitado;
    }

    public void setExameSolicitado(boolean exameSolicitado) {
        this.exameSolicitado = exameSolicitado;
    }
}
