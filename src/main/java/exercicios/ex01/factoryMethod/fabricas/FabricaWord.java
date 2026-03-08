package exercicios.ex01.factoryMethod.fabricas;

import exercicios.ex01.factoryMethod.documentos.Word;

public class FabricaWord extends FabricaDocumento<Word> {
    public FabricaWord() {
        super(Word.class);
    }
}