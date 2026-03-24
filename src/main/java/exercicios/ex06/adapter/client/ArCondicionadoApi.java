package exercicios.ex06.adapter.client;

public class ArCondicionadoApi {
    private Integer temperatura;
    private Boolean ligado;

    public ArCondicionadoApi() {
        this.temperatura = 25;
        this.ligado = false;
    }

    public void ligar(){
        if (ligado == false){
            System.out.println("Ligando o Ar Condicionado...");
            ligado = true;
        } else {
            System.out.println("O Ar Condicionado já está ligado.");
        }
    }
    public void desligar(){
        if (ligado == true){
            System.out.println("Desligando o Ar Condicionado...");
            ligado = false;
        } else {
            System.out.println("O Ar Condicionado já está desligado.");
        }
    }
    public void aumentarTemperatura(){
        temperatura = restricaoVolume(temperatura + 1);
        System.out.println("Aumentando o temperatura do Ar Condicionado para: " + temperatura);

    }
    public void reduzirTemperatura(){
        temperatura = restricaoVolume(temperatura - 1);
        System.out.println("Diminuindo o temperatura do Ar Condicionado para: " + temperatura);

    }

    private int restricaoVolume(int temperatura) {
        if (temperatura < 15) {
            return 15;
        } else if (temperatura > 32) {
            return 32;
        } else {
            return temperatura;
        }
    }
}
