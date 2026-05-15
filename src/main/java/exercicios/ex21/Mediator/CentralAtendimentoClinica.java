package exercicios.ex21.Mediator;

public class CentralAtendimentoClinica implements MediadorClinica{

    private Enfermagem enfermagem;
    private Laboratorio laboratorio;
    private Medico medico;
    private Paciente paciente;
    private Recepcao recepcao;

    public CentralAtendimentoClinica(Enfermagem enfermagem, Laboratorio laboratorio, Medico medico, Paciente paciente, Recepcao recepcao) {
        this.enfermagem = enfermagem;
        this.laboratorio = laboratorio;
        this.medico = medico;
        this.paciente = paciente;
        this.recepcao = recepcao;
    }

    @Override
    public void solicitarAtendimento() {
        if (recepcao.isSalaCheia()){
            System.out.println("Sala de atendimento cheia, aguarde um momento.");
        } else {
            System.out.println("Sala de atendimento disponível, por favor, entre.");
            recepcao.setSalaCheia(true);
            paciente.setPacienteChegou(true);
            recepcao.iniciarAtendimento(paciente);
        }

    }

    @Override
    public void iniciarAtendimento(Paciente paciente) {
        if (paciente.isPacienteChegou()){
            System.out.println("Iniciando atendimento para o paciente.");
        } else {
            System.out.println("Nenhum paciente para iniciar atendimento, por favor, solicite um atendimento primeiro.");
        }
    }

    @Override
    public void solicitarExame(String exame) {
        if (laboratorio.isLaboratorioDisponivel()){
            System.out.println("Exame solicitado: " + exame);
            medico.setExameSolicitado(true);
        } else {
            System.out.println("Laboratório indisponível, aguarde um momento.");
        }
    }

    @Override
    public void realizarExame(String exame) {
        if (medico.isExameSolicitado()){
            System.out.println("Realizando exame: " + exame);
            medico.setExameSolicitado(false);
        } else {
            System.out.println("Nenhum exame solicitado, por favor, solicite um exame primeiro.");
        }
    }

    @Override
    public void solicitarEnfermagem(String acao) {
        if (enfermagem.isEnfermagemDisponivel()){
            System.out.println("Ação de enfermagem solicitada: " + acao);
            enfermagem.setEnfermagemDisponivel(false);
        } else {
            System.out.println("Enfermagem indisponível, aguarde um momento.");
        }
    }

    @Override
    public void realizarAcaoEnfermagem(String acao) {
        if (paciente.isPacienteChegou()){
            System.out.println("Realizando ação de enfermagem: " + acao);
            enfermagem.setEnfermagemDisponivel(true);
        } else {
            System.out.println("Nenhum paciente para realizar ação de enfermagem, por favor, solicite um atendimento primeiro.");
        }
    }

    @Override
    public void finalizarAtendimento() {
        if (paciente.isPacienteChegou()){
            System.out.println("Finalizando atendimento para o paciente.");
            recepcao.setSalaCheia(false);
            paciente.setPacienteChegou(false);
        } else {
            System.out.println("Nenhum paciente para finalizar atendimento, por favor, inicie um atendimento primeiro.");
        }
    }
}
