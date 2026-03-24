package exercicios.ex06.adapter;

import exercicios.ex06.adapter.controleUniversal.MiRemoteApp;
import exercicios.ex06.adapter.adapter.ArCondicionadoAdapter;
import exercicios.ex06.adapter.adapter.LgAdapter;
import exercicios.ex06.adapter.adapter.SamsungAdapter;
import exercicios.ex06.adapter.client.ArCondicionadoApi;
import exercicios.ex06.adapter.client.TvLgApi;
import exercicios.ex06.adapter.client.TvSamsungApi;

public class Main {

    public static void main(String[] args) {

        TvSamsungApi tvSamsung = new TvSamsungApi();
        TvLgApi tvLg = new TvLgApi();
        ArCondicionadoApi arCondicionado = new ArCondicionadoApi();

        SamsungAdapter samsungAdapter = new SamsungAdapter(tvSamsung);
        LgAdapter lgAdapter = new LgAdapter(tvLg);
        ArCondicionadoAdapter arCondicionadoAdapter = new ArCondicionadoAdapter(arCondicionado);

        MiRemoteApp controle = new MiRemoteApp();

        System.out.println("=== TESTE TV SAMSUNG ===");
        controle.setDispositivo(samsungAdapter);
        controle.ligar();
        controle.aumentarVolume();
        controle.diminuirVolume();
        controle.desligar();

        System.out.println("\n=== TESTE TV LG ===");
        controle.setDispositivo(lgAdapter);
        controle.ligar();
        controle.aumentarVolume();
        controle.diminuirVolume();
        controle.desligar();

        System.out.println("\n=== TESTE Ar Condicionado ===");
        controle.setDispositivo(arCondicionadoAdapter);
        controle.ligar();
        controle.aumentarVolume();
        controle.diminuirVolume();
        controle.desligar();
    }
}