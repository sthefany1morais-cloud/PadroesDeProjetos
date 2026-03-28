package exercicios.ex08.facade.subsistemas;

import exercicios.ex08.facade.dominio.Reserva;

public class ComprovanteService {
    public Reserva gerarComprovante(String destino) {
        System.out.println("Comprovante gerado");
        return new Reserva(destino, "RES 123");
    }
}