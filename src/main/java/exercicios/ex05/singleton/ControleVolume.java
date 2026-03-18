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
        if (passo < 0) {
            throw new IllegalArgumentException("Passo deve ser um valor positivo.");
        }
        int novoVolume = volume + passo;
        if (novoVolume > 100) {
            volume = 100;
        }
        this.volume = novoVolume;
    }

    public void diminuir(int passo){
        if (passo < 0) {
            throw new IllegalArgumentException("Passo deve ser um valor positivo.");
        }
        int novoVolume = volume - passo;
        if (novoVolume < 0) {
            volume = 0;
        }
        this.volume = novoVolume;

    }

    public void mutar() {
        volume = 0;
    }

    public void setVolume(int novoVolume){
        if (novoVolume < 0) {
            throw new IllegalArgumentException("Volume deve ser um valor positivo.");
        }
        volume = novoVolume;
    }

}
