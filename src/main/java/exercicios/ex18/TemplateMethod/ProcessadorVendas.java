package exercicios.ex18.TemplateMethod;

public class ProcessadorVendas extends ProcessadorArquivo{

    private String dataVenda;
    private String produtoVendido;
    private int quantidade;
    private double valorTotal;

    public ProcessadorVendas(String dataVenda, String produtoVendido, int quantidade, double valorTotal) {
        this.dataVenda = dataVenda;
        this.produtoVendido = produtoVendido;
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
    }

    @Override
    public void validarEstrutura() {
        System.out.println("Validando estrutura do arquivo de vendas...");
    }

    @Override
    public void lerDados() {
        System.out.println("Lendo dados da venda: " + produtoVendido);
        System.out.println("Data da venda: " + dataVenda);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total: " + valorTotal);
    }

    @Override
    public void processarDados() {
        System.out.println("Processando dados da venda: " + produtoVendido);
    }
}