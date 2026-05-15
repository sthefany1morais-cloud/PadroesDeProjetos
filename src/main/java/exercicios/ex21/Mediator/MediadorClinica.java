package exercicios.ex21.Mediator;

public interface MediadorClinica {

        void solicitarAtendimento();;
        void iniciarAtendimento(Paciente paciente);
        void solicitarExame(String exame);
        void realizarExame(String exame);
        void solicitarEnfermagem(String acao);
        void realizarAcaoEnfermagem(String acao);
        void finalizarAtendimento();
}
//Um paciente chegando à clínica.
//A recepção iniciando o atendimento.
//O médico solicitando uma ação relacionada ao paciente.
//Outro setor respondendo à solicitação.
//A recepção ou central finalizando o atendimento.