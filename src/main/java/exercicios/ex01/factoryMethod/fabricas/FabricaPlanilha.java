package exercicios.ex01.factoryMethod.fabricas;

import exercicios.ex01.factoryMethod.documentos.Planilha;

public class FabricaPlanilha extends FabricaDocumento<Planilha>{

    public FabricaPlanilha(){
        super(Planilha.class);
    }
}
