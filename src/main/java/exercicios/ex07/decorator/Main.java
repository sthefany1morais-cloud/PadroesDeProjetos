package exercicios.ex07.decorator;
import exercicios.ex07.decorator.bebida.*;
import exercicios.ex07.decorator.decorador.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cenário 1 - Café com leite extra:");
        Bebida cafeComLeite = new LeiteExtraDecorator(new Cafe());
        System.out.println("Bebida: " + cafeComLeite.getDescricao());
        System.out.println("Preço: R$ " + cafeComLeite.getPreco());
        System.out.println();

        System.out.println("Cenário 2 - Capuccino com chantilly e canela:");
        Bebida capuccinoComAdicionais = new CanelaDecorator(new ChantillyDecorator(new Capuccino()));
        System.out.println("Bebida: " + capuccinoComAdicionais.getDescricao());
        System.out.println("Preço: R$ " + capuccinoComAdicionais.getPreco());
        System.out.println();

        System.out.println("Cenário 3 - Chocolate quente com leite extra, chantilly e calda de chocolate:");
        Bebida chocolateComAdicionais = new CaldaChocolateDecorator(new ChantillyDecorator(new LeiteExtraDecorator(new ChocolateQuente())));
        System.out.println("Bebida: " + chocolateComAdicionais.getDescricao());
        System.out.println("Preço: R$ " + chocolateComAdicionais.getPreco());
    }
}