package exercicios.ex12.flyweight;

public class Main {
    public static void main(String[] args) {
        Bloco pedra1 = BlocoFactory.getBloco("Pedra", "textura_pedra.png", true);
        Bloco pedra2 = BlocoFactory.getBloco("Pedra", "textura_pedra.png", true);
        Bloco pedra3 = BlocoFactory.getBloco("Pedra", "textura_pedra.png", true);

        Bloco grama1 = BlocoFactory.getBloco("Grama", "textura_grama.png", false);
        Bloco grama2 = BlocoFactory.getBloco("Grama", "textura_grama.png", false);

        Bloco madeira1 = BlocoFactory.getBloco("Madeira", "textura_madeira.png", true);

        pedra1.exibir(10, 64, 20);
        pedra2.exibir(11, 64, 20);
        pedra3.exibir(12, 64, 20);

        grama1.exibir(15, 64, 22);
        grama2.exibir(16, 64, 22);

        madeira1.exibir(30, 65, 10);

        System.out.println();

        System.out.println("pedra1 e pedra2 são o mesmo objeto? " + (pedra1 == pedra2));
        System.out.println("pedra1 e pedra3 são o mesmo objeto? " + (pedra1 == pedra3));
        System.out.println("pedra2 e pedra3 são o mesmo objeto? " + (pedra2 == pedra3));
        System.out.println("grama1 e grama2 são o mesmo objeto? " + (grama1 == grama2));

        System.out.println();

        System.out.println("pedra1 e madeira1 são o mesmo objeto? " + (pedra1 == madeira1));
        System.out.println("grama1 e madeira1 são o mesmo objeto? " + (grama1 == madeira1));
        System.out.println("pedra1 e grama1 são o mesmo objeto? " + (pedra1 == grama1));

    }
}