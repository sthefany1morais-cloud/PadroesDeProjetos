package exercicios.ex17.State;

public class EstadoCancelado implements EstadoChamado{
    @Override
    public void iniciarAtendimento(Chamado chamado) {
        System.out.println("Não é possível iniciar atendimento. O chamado está cancelado.");
    }

    @Override
    public void aguardarCliente(Chamado chamado) {
        System.out.println("Não é possível aguardar o cliente. O chamado está cancelado.");
    }

    @Override
    public void responderCliente(Chamado chamado) {
        System.out.println("Não é possível responder o cliente. O chamado está cancelado.");
    }

    @Override
    public void resolver(Chamado chamado) {
        System.out.println("Não é possível resolver o chamado. O chamado está cancelado.");
    }

    @Override
    public void cancelar(Chamado chamado) {
        System.out.println("O chamado já está cancelado.");
    }
}
