package exercicios.ex02.abstractFactory.produtos.nacional;

import exercicios.ex02.abstractFactory.produtos.Frete;

public class FreteNacional implements Frete {
    @Override
    public double calcularFrete(double pesoKg, String cepDestino) {
        return pesoKg*5;
    }
}
