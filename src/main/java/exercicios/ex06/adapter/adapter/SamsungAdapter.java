package exercicios.ex06.adapter.adapter;

import exercicios.ex06.adapter.controleUniversal.ControleUniversal;
import exercicios.ex06.adapter.client.TvSamsungApi;

public class SamsungAdapter implements ControleUniversal {
    private TvSamsungApi tvSamsung;

    public SamsungAdapter(TvSamsungApi tvSamsung) {
        this.tvSamsung = tvSamsung;
    }

    @Override
    public void ligar() {
        tvSamsung.powerOn();
    }

    @Override
    public void desligar() {
        tvSamsung.powerOff();
    }

    @Override
    public void aumentarVolume() {
        tvSamsung.volumeUp();
    }

    @Override
    public void diminuirVolume() {
        tvSamsung.volumeDown();
    }
}
