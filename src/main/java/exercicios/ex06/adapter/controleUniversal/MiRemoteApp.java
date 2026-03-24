package exercicios.ex06.adapter.controleUniversal;

public class MiRemoteApp {

    private ControleUniversal dispositivo;

    public void setDispositivo(ControleUniversal dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void ligar() {
        dispositivo.ligar();
    }

    public void desligar() {
        dispositivo.desligar();
    }

    public void aumentarVolume() {
        dispositivo.aumentar();
    }

    public void diminuirVolume() {
        dispositivo.diminuir();
    }
}