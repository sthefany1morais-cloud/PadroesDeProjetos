package exercicios.ex17.State;

public class EstadoAguardandoCliente implements EstadoChamado{
    @Override
    public void iniciarAtendimento(Chamado chamado) {
        System.out.println("O chamado já está aguardando o cliente. Não é possível iniciar atendimento.");
    }

    @Override
    public void aguardarCliente(Chamado chamado) {
        System.out.println("O chamado já está aguardando o cliente.");
    }

    @Override
    public void responderCliente(Chamado chamado) {
        System.out.println("Respondendo ao cliente.");
        chamado.setEstado(new EstadoEmAtendimento());
    }

    @Override
    public void resolver(Chamado chamado) {
        System.out.println("Não é possível resolver o chamado. O cliente ainda não foi respondido.");
    }

    @Override
    public void cancelar(Chamado chamado) {
        System.out.println("Cancelando o chamado.");
        chamado.setEstado(new EstadoCancelado());
    }
}
