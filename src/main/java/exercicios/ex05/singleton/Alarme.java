package exercicios.ex05.singleton;

public class Alarme {


    public void tocarAlarme(){
        setVolume();
        musica();
        mostrarVolume();
    }

    public void pararAlarme(){
        mutarAlarme();
        System.out.println("Alarme parado!");
        mostrarVolume();
    }

    private void setVolume(){
        ControleVolume.getInstance().setVolume(80);
    }
    private void musica(){
        System.out.println("Alarme tocando!");
    }

    private void mutarAlarme(){
        ControleVolume.getInstance().mutar();
    }

    public void mostrarVolume(){
        System.out.println("Volume do alarme: " + ControleVolume.getInstance().getVolume());
    }

}
