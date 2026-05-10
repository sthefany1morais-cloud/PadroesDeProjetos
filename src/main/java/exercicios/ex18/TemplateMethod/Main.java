package exercicios.ex18.TemplateMethod;

public class Main {
    public static void main(String[] args) {

        // Criar um processador de clientes e executar o processamento
        ProcessadorArquivo processadorClientes = new ProcessadorClientes("João Silva", "123.456.789-00", "joao.silva@email.com", "11 99999-9999");
        processadorClientes.processarArquivo();

        System.out.println("\n-----------------------------------\n");

        // Criar um processador de produtos e executar o processamento
        ProcessadorArquivo processadorProdutos = new ProcessadorProdutos("P001", "Notebook", 2500.0, 10);
        processadorProdutos.processarArquivo();

        System.out.println("\n-----------------------------------\n");

        ProcessadorArquivo processadorVendas = new ProcessadorVendas("2023-10-01", "Notebook", 2, 5000.0);
        processadorVendas.processarArquivo();


    }
}
//criar um processador de clientes;
//executar o processamento;
//criar um processador de produtos;
//executar o processamento;
//criar um processador de vendas;
//executar o processamento.