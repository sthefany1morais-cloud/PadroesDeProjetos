package exercicios.ex07.decorator.decorador;
import exercicios.ex07.decorator.bebida.Bebida;

public class ChantillyDecorator implements Bebida {
    private Bebida bebida;

    public ChantillyDecorator(Bebida bebida) {
        this.bebida = bebida;
    }

    public String getDescricao() {
        return bebida.getDescricao() + " + Chantilly";
    }

    public double getPreco() {
        return bebida.getPreco() + 3.0;
    }
}