package exercicios.ex06.adapter.adapter;

import exercicios.ex06.adapter.controleUniversal.ControleUniversal;
import exercicios.ex06.adapter.client.ArCondicionadoApi;

public class ArCondicionadoAdapter implements ControleUniversal {
    private ArCondicionadoApi arCondicionado;

    public ArCondicionadoAdapter(ArCondicionadoApi arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    @Override
    public void ligar() {
        arCondicionado.ligar();
    }

    @Override
    public void desligar() {
        arCondicionado.desligar();
    }

    @Override
    public void aumentar() {
        arCondicionado.aumentarTemperatura();
    }

    @Override
    public void diminuir() {
        arCondicionado.reduzirTemperatura();
    }
}
