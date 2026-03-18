package exercicios.ex05.singleton;

public class BotaoFisicoVolume {

    public void pressionarMais(){
        ControleVolume.getInstance().aumentar(5);
        System.out.println("Volume aumentado para: " + ControleVolume.getInstance().getVolume());
        mostrarVolume();
    }
    public void pressionarMenos(){
        ControleVolume.getInstance().diminuir(5);
        System.out.println("Volume diminuído para: " + ControleVolume.getInstance().getVolume());
        mostrarVolume();
    }

    public void mostrarVolume(){
        System.out.println("Volume atual do controle físico: " + ControleVolume.getInstance().getVolume());
    }

}
