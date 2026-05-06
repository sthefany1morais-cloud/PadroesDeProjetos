package exercicios.ex17.State;

public class EstadoAberto implements EstadoChamado{
    @Override
    public void iniciarAtendimento(Chamado chamado) {
        System.out.println("Iniciando atendimento do chamado.");
        chamado.setEstado(new EstadoAguardandoCliente());
    }

    @Override
    public void aguardarCliente(Chamado chamado) {
        System.out.println("Não é possível aguardar o cliente. O chamado ainda não foi atendido.");

    }

    @Override
    public void responderCliente(Chamado chamado) {
        System.out.println("Não é possível responder o cliente. O chamado ainda não foi atendido.");
    }

    @Override
    public void resolver(Chamado chamado) {
        System.out.println("Não é possível resolver o chamado. O chamado ainda não foi atendido.");
    }

    @Override
    public void cancelar(Chamado chamado) {
            System.out.println("Cancelando o chamado.");
            chamado.setEstado(new EstadoCancelado());
    }
}
