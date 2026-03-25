package exercicios.ex07.decorator;

import exercicios.ex07.decorator.bebida.Bebida;
import exercicios.ex07.decorator.bebida.Cafe;
import exercicios.ex07.decorator.bebida.Capuccino;
import exercicios.ex07.decorator.bebida.ChocolateQuente;
import exercicios.ex07.decorator.decorador.CaldaChocolateDecorator;
import exercicios.ex07.decorator.decorador.CanelaDecorator;
import exercicios.ex07.decorator.decorador.ChantillyDecorator;
import exercicios.ex07.decorator.decorador.LeiteExtraDecorator;

public class Main {

    public static void main(String[] args) {

        Bebida cafe = new Cafe();
        cafe = new CaldaChocolateDecorator(cafe);
        cafe = new CanelaDecorator(cafe);

        System.out.println("=== CAFÉ ===");
        System.out.println();
        System.out.println(cafe.preparar());
        System.out.println(cafe.servir());
        System.out.println(cafe.beber());
        System.out.println();
        System.out.println(cafe.getDescricao());

        System.out.println("\n----------------------\n");

        Bebida capuccino = new Capuccino();
        capuccino = new ChantillyDecorator(capuccino);
        capuccino = new LeiteExtraDecorator(capuccino);
        capuccino = new CanelaDecorator(capuccino);

        System.out.println("=== CAPUCCINO ===");
        System.out.println();
        System.out.println(capuccino.preparar());
        System.out.println(capuccino.servir());
        System.out.println(capuccino.beber());
        System.out.println();
        System.out.println(capuccino.getDescricao());

        System.out.println("\n----------------------\n");

        Bebida chocolate = new ChocolateQuente();
        chocolate = new ChantillyDecorator(chocolate);
        chocolate = new CaldaChocolateDecorator(chocolate);

        System.out.println("=== CHOCOLATE QUENTE ===");
        System.out.println();
        System.out.println(chocolate.preparar());
        System.out.println(chocolate.servir());
        System.out.println(chocolate.beber());
        System.out.println();
        System.out.println(chocolate.getDescricao());
    }
}