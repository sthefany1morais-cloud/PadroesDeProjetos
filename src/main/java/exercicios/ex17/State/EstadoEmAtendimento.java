package exercicios.ex17.State;

public class EstadoEmAtendimento implements EstadoChamado{
    @Override
    public void iniciarAtendimento(Chamado chamado) {
            System.out.println("O chamado já está em atendimento.");
    }

    @Override
    public void aguardarCliente(Chamado chamado) {
            System.out.println("O chamado está aguardando o cliente.");
            chamado.setEstado(new EstadoAguardandoCliente());
    }

    @Override
    public void responderCliente(Chamado chamado) {
            System.out.println("O cliente já foi respondido. Não é possível responder novamente.");
    }

    @Override
    public void resolver(Chamado chamado) {
            System.out.println("Resolvendo o chamado.");
            chamado.setEstado(new EstadoResolvido());
    }

    @Override
    public void cancelar(Chamado chamado) {
            System.out.println("Cancelando o chamado.");
            chamado.setEstado(new EstadoCancelado());
    }
}
