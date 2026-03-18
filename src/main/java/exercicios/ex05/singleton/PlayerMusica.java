package exercicios.ex05.singleton;

public class PlayerMusica {


    public void aumentarVolume(){
        ControleVolume.getInstance().aumentar(10);
        mostrarVolume();
    }
    public void diminuirVolume(){
        ControleVolume.getInstance().diminuir(10);
        mostrarVolume();
    }
    public void mostrarVolume(){
        System.out.println("Volume atual do player de música: " + ControleVolume.getInstance().getVolume());
    }
}
