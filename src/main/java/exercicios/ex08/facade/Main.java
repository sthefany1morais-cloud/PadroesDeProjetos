package exercicios.ex08.facade;

import exercicios.ex08.facade.dominio.Cliente;

public class Main {
    public static void main(String[] args) {
        ViagemFacade viagemFacade = new ViagemFacade();

        System.out.println("Cenário 1: Reserva simples");
        Cliente joao = new Cliente("João", "joao@email.com");
        viagemFacade.reservarViagem(joao, "Recife");
        System.out.println();

        System.out.println("Cenário 2: Outro destino");
        Cliente maria = new Cliente("Maria", "maria@email.com");
        viagemFacade.reservarViagem(maria, "São Paulo");
    }
}