package exercicios.ex06.adapter.adapter;

import exercicios.ex06.adapter.controleUniversal.ControleUniversal;
import exercicios.ex06.adapter.client.TvLgApi;

public class LgAdapter implements ControleUniversal {
    private TvLgApi tvLg;

    public LgAdapter(TvLgApi tvLg) {
        this.tvLg = tvLg;
    }

    @Override
    public void ligar() {
        tvLg.ligarTv();
    }

    @Override
    public void desligar() {
        tvLg.desligarTv();
    }

    @Override
    public void aumentarVolume() {
        tvLg.aumentarSom();
    }

    @Override
    public void diminuirVolume() {
        tvLg.reduzirSom();
    }
}
