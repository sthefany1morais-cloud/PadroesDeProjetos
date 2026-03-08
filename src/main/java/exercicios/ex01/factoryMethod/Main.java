package exercicios.ex01.factoryMethod;

import exercicios.ex01.factoryMethod.fabricas.FabricaDocumento;
import exercicios.ex01.factoryMethod.fabricas.FabricaPDF;
import exercicios.ex01.factoryMethod.fabricas.FabricaPlanilha;
import exercicios.ex01.factoryMethod.fabricas.FabricaWord;

public class Main {

    public static void main(String[] args) {

        FabricaDocumento<?> fabricaWord = new FabricaWord();
        FabricaDocumento<?> fabricaPDF = new FabricaPDF();
        FabricaDocumento<?> fabricaPlanilha = new FabricaPlanilha();

        System.out.println("=== Word ===");
        System.out.println(fabricaWord.enviar());
        System.out.println("\n----------------");
        System.out.println(fabricaWord.enviar("Mensagem para Word"));

        System.out.println();

        System.out.println("=== PDF ===");
        System.out.println(fabricaPDF.enviar());
        System.out.println("\n----------------");
        System.out.println(fabricaPDF.enviar("Mensagem para PDF"));

        System.out.println("\n----------------");;

        System.out.println("=== Planilha ===");
        System.out.println(fabricaPlanilha.enviar());
        System.out.println();
        System.out.println(fabricaPlanilha.enviar("Mensagem para Planilha"));

    }
}