package exercicios.ex08.facade.subsistemas;

import exercicios.ex08.facade.dominio.Cliente;
import exercicios.ex08.facade.dominio.Reserva;

public class NotificacaoService {
    public void enviarConfirmacao(Cliente cliente, Reserva reserva) {
        System.out.println("Confirmação enviada para " + cliente.getEmail() +
                " com código " + reserva.getCodigo());
    }
}