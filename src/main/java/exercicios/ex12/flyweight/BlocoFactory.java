package exercicios.ex12.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BlocoFactory {

    private static final Map<String, Bloco> blocos = new HashMap<>();

    public static Bloco getBloco(String nome, String textura, boolean solido) {

        String chave = nome + "-" + textura + "-" + solido;
        if (!blocos.containsKey(chave)) {
            blocos.put(chave, new TipoBloco(nome, textura, solido));
        }
        return blocos.get(chave);
    }


}
