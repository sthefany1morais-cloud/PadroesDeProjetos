package exercicios.ex17.State;

public class EstadoResolvido implements EstadoChamado{

    @Override
    public void iniciarAtendimento(Chamado chamado) {
        System.out.println("Não é possível iniciar atendimento. O chamado já está resolvido.");
    }

    @Override
    public void aguardarCliente(Chamado chamado) {
        System.out.println("Não é possível aguardar o cliente. O chamado já está resolvido.");
    }

    @Override
    public void responderCliente(Chamado chamado) {
        System.out.println("Não é possível responder o cliente. O chamado já está resolvido.");
    }

    @Override
    public void resolver(Chamado chamado) {
        System.out.println("O chamado já está resolvido.");
    }

    @Override
    public void cancelar(Chamado chamado) {
        System.out.println("Não é possível cancelar o chamado. O chamado já está resolvido.");
    }
}
