package exercicios.ex07.decorator.decorador;
import exercicios.ex07.decorator.bebida.Bebida;

public class CanelaDecorator implements Bebida {
    private Bebida bebida;

    public CanelaDecorator(Bebida bebida) {
        this.bebida = bebida;
    }

    public String getDescricao() {
        return bebida.getDescricao() + " + Canela";
    }

    public double getPreco() {
        return bebida.getPreco() + 1.5;
    }
}