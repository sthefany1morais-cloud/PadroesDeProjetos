package exercicios.ex18.TemplateMethod;

public abstract class ProcessadorArquivo {

    public final void processarArquivo(){
        abrirArquivo();
        validarEstrutura();
        lerDados();
        processarDados();
        salvarResultado();
        fecharArquivo();
    }

    public void abrirArquivo(){
        System.out.println("Abrindo arquivo...");
    }

    public abstract void validarEstrutura();

    public abstract void lerDados();

    public abstract void processarDados();

    public void salvarResultado(){
        System.out.println("Salvando resultado...");
    }

        public void fecharArquivo(){
            System.out.println("Fechando arquivo...");
        }
}