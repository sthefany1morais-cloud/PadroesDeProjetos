package exercicios.ex07.decorator.bebida;

public class Cafe implements Bebida {
    public String getDescricao() {
        return "Café";
    }

    public double getPreco() {
        return 5.0;
    }
}