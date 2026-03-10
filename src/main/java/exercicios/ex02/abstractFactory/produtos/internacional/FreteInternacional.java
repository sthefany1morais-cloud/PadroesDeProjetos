package exercicios.ex02.abstractFactory.produtos.internacional;

import exercicios.ex02.abstractFactory.produtos.Frete;

public class FreteInternacional implements Frete {
    @Override
    public double calcularFrete(double pesoKg, String cepDestino) {
        return pesoKg*10;
    }
}
