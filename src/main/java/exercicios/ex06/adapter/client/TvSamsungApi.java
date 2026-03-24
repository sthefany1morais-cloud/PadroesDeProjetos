package exercicios.ex06.adapter.client;

public class TvSamsungApi {
    private Integer volume;
    private Boolean ligada;

    public TvSamsungApi() {
        this.volume = 50;
        this.ligada = false;
    }

    public void powerOn(){
        if (ligada == false){
            System.out.println("Ligando a TV Samsung...");
            ligada = true;
        } else {
            System.out.println("A TV Samsung já está ligada.");
        }
    }
    public void powerOff(){
        if (ligada == true){
            System.out.println("Desligando a TV Samsung...");
            ligada = false;
        } else {
            System.out.println("A TV Samsung já está desligada.");
        }
    }
    public void volumeUp(){
            volume = restricaoVolume(volume + 10);
            System.out.println("Aumentando o volume da TV Samsung para: " + volume);

    }
    public void volumeDown(){
        volume = restricaoVolume(volume - 10);
        System.out.println("Diminuindo o volume da TV Samsung para: " + volume);

    }

    private int restricaoVolume(int volume) {
        if (volume < 0) {
            return 0;
        } else if (volume > 100) {
            return 100;
        } else {
            return volume;
        }
    }
}
