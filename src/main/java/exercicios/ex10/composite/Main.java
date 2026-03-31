package exercicios.ex10.composite;

public class Main {

    public static void main(String[] args) {

        Produto mouse = new Produto("Mouse", 80);
        Produto teclado = new Produto("Teclado", 150);
        Produto monitor = new Produto("Monitor", 900);
        Produto mousepad = new Produto("Mousepad", 40);

        Kit kitPerifericos = new Kit("Kit Periféricos");
        kitPerifericos.adicionarItem(mouse);
        kitPerifericos.adicionarItem(teclado);
        kitPerifericos.adicionarItem(mousepad);

        Kit kitSetup = new Kit("Kit Setup");
        kitSetup.adicionarItem(monitor);
        kitSetup.adicionarItem(kitPerifericos);

        System.out.println("=== Kits Disponíveis ===");
        kitPerifericos.exibir("");
        System.out.println();
        kitSetup.exibir("");
    }
}