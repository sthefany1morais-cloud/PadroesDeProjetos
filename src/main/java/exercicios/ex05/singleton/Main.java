package exercicios.ex05.singleton;

public class Main {
    public static void main(String[] args) {

        PlayerMusica player = new PlayerMusica();
        BotaoFisicoVolume botao = new BotaoFisicoVolume();
        Alarme alarme = new Alarme();

        System.out.println("=== Estado inicial ===");
        player.mostrarVolume();
        alarme.mostrarVolume();
        botao.mostrarVolume();

        System.out.println("\n=== Player aumenta volume ===");
        player.aumentarVolume();

        System.out.println("\n=== Estado dos volumes após aumento pelo player ===\n\n");

        player.mostrarVolume();
        alarme.mostrarVolume();
        botao.mostrarVolume();

        System.out.println("\n=== Botão físico aumenta volume ===\n\n");
        botao.pressionarMais();

        System.out.println("\n=== Estado dos volumes após aumento pelo botão físico ===\n\n");

        player.mostrarVolume();
        alarme.mostrarVolume();
        botao.mostrarVolume();


        System.out.println("\n=== Player diminui volume ===");
        player.diminuirVolume();

        System.out.println("\n=== Estado dos volumes após diminuição pelo player ===\n\n");

        player.mostrarVolume();
        alarme.mostrarVolume();
        botao.mostrarVolume();

        System.out.println("\n=== Botão físico diminui volume ===");
        botao.pressionarMenos();

        System.out.println("\n=== Estado dos volumes após diminuição pelo botão físico ===\n\n");

        player.mostrarVolume();
        alarme.mostrarVolume();
        botao.mostrarVolume();

        System.out.println("\n=== Alarme toca ===");
        alarme.tocarAlarme();

        System.out.println("\n=== Estado dos volumes após alarme tocar ===\n\n");

        player.mostrarVolume();
        alarme.mostrarVolume();
        botao.mostrarVolume();

        System.out.println("\n=== Parar alarme ===");
        alarme.pararAlarme();

        System.out.println("\n=== Estado dos volumes após alarme parar ===\n\n");

        player.mostrarVolume();
        alarme.mostrarVolume();
        botao.mostrarVolume();

    }
}