package exercicios.ex08.facade.subsistemas;

import exercicios.ex08.facade.dominio.Reserva;

public class TransportService {
    public void reservarTransporte(String destino) {
        System.out.println("Transporte reservado no destino " + destino);
    }
}