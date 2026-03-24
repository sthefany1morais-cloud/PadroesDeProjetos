package exercicios.ex06.adapter.client;

public class TvLgApi {
    private Integer volume;
    private Boolean ligada;

    public TvLgApi() {
        this.volume = 50;
        this.ligada = false;
    }

    public void ligarTv(){
        if (ligada == false){
            System.out.println("Ligando a TV LG...");
            ligada = true;
        } else {
            System.out.println("A TV LG já está ligada.");
        }
    }
    public void desligarTv(){
        if (ligada == true){
            System.out.println("Desligando a TV LG...");
            ligada = false;
        } else {
            System.out.println("A TV LG já está desligada.");
        }
    }
    public void aumentarSom(){
        volume = restricaoVolume(volume + 10);
        System.out.println("Aumentando o volume da TV LG para: " + volume);

    }
    public void reduzirSom(){
        volume = restricaoVolume(volume - 10);
        System.out.println("Diminuindo o volume da TV LG para: " + volume);

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
