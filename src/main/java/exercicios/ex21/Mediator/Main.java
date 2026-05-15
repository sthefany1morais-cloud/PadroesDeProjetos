package exercicios.ex21.Mediator;

public class Main {

    public static void main(String[] args) {

        // Participantes
        Enfermagem enfermagem = new Enfermagem();
        Laboratorio laboratorio = new Laboratorio();
        Medico medico = new Medico();
        Paciente paciente = new Paciente();
        Recepcao recepcao = new Recepcao();

        // Mediador
        CentralAtendimentoClinica central =
                new CentralAtendimentoClinica(
                        enfermagem,
                        laboratorio,
                        medico,
                        paciente,
                        recepcao
                );

        enfermagem.setCentral(central);
        laboratorio.setCentral(central);
        medico.setMediator(central);
        paciente.setMediator(central);
        recepcao.setCentral(central);

        System.out.println("===== INÍCIO DO ATENDIMENTO =====\n");

        // Paciente chega à clínica
        paciente.solicitarAtendimento();

        System.out.println();

        // Médico solicita exame
        medico.solicitarExame("Exame de sangue");

        System.out.println();

        // Central coordena realização do exame
        central.realizarExame("Exame de sangue");

        System.out.println();

        // Médico solicita enfermagem
        medico.soliciarEnfermagem(central, "Aplicação de medicação");

        System.out.println();

        // Central coordena ação da enfermagem
        central.realizarAcaoEnfermagem("Aplicação de medicação");

        System.out.println();

        // Finalização do atendimento
        central.finalizarAtendimento();

        System.out.println("\n===== FIM DO ATENDIMENTO =====");
    }
}