package exercicios.ex01.factoryMethod.fabricas;

import exercicios.ex01.factoryMethod.documentos.PDF;

public class FabricaPDF extends FabricaDocumento<PDF>{
    public FabricaPDF() {
        super(PDF.class);
    }
}
