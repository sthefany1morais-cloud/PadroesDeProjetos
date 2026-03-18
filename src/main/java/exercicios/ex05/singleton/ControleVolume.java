package exercicios.ex05.singleton;

public class ControleVolume {

    private static final ControleVolume INSTANCE = new ControleVolume();
    private int volume;

    public static ControleVolume getInstance() { return INSTANCE; }

    private ControleVolume() { }

    public int getVolume(){
        return volume;
    }

    public void aumentar(int passo){
        passo = Math.abs(passo);
        setVolume(this.volume + passo);
    }

    public void diminuir(int passo){
        passo = Math.abs(passo);
        setVolume(this.volume - passo);

    }

    public void mutar() {
        setVolume(0);
    }

    public void setVolume(int novoVolume){
        if (novoVolume < 0) {
            volume = 0;
        } else if (novoVolume > 100) {
            volume = 100;
        } else {
            volume = novoVolume;
        }
    }

}
