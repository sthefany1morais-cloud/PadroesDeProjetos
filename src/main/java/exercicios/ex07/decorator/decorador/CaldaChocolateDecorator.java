package exercicios.ex07.decorator.decorador;
import exercicios.ex07.decorator.bebida.Bebida;

public class CaldaChocolateDecorator implements Bebida {
    private Bebida bebida;

    public CaldaChocolateDecorator(Bebida bebida) {
        this.bebida = bebida;
    }

    public String getDescricao() {
        return bebida.getDescricao() + " + Calda de Chocolate";
    }

    public double getPreco() {
        return bebida.getPreco() + 2.5;
    }
}