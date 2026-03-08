package exercicios.ex01.factoryMethod.documentos;

public class Word implements Documento{
    @Override
    public String enviar(String mensagem) {
        return mensagem + "\n" + enviar();
    }

    @Override
    public String enviar() {
        return "Enviando via Word";
    }
}
