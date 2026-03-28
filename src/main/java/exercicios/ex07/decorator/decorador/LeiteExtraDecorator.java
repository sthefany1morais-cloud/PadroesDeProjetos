package exercicios.ex07.decorator.decorador;
import exercicios.ex07.decorator.bebida.Bebida;

public class LeiteExtraDecorator implements Bebida {
    private Bebida bebida;

    public LeiteExtraDecorator(Bebida bebida) {
        this.bebida = bebida;
    }

    public String getDescricao() {
        return bebida.getDescricao() + " + Leite Extra";
    }

    public double getPreco() {
        return bebida.getPreco() + 2.0;
    }
}