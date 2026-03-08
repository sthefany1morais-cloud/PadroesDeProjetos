package exercicios.ex01.factoryMethod.fabricas;

import exercicios.ex01.factoryMethod.documentos.Documento;

public abstract class FabricaDocumento<T extends Documento>{

    private final Class<T> tipoDocumento;

    public FabricaDocumento(Class<T> tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    protected Documento criarDocumento(){
        try {
            return tipoDocumento.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao criar documento", e);
        }
    }

    public String enviar(String mensagem){
        Documento documento = criarDocumento();
        return documento.enviar(mensagem);
    }

    public String enviar(){
        Documento documento = criarDocumento();
        return documento.enviar();
    }
}
