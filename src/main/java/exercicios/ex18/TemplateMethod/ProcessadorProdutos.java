package exercicios.ex18.TemplateMethod;

public class ProcessadorProdutos extends ProcessadorArquivo{

        private String codigo;
        private String descricao;
        private double preco;
        private int quantidadeEstoque;

        public ProcessadorProdutos(String codigo, String descricao, double preco, int quantidadeEstoque) {
            this.codigo = codigo;
            this.descricao = descricao;
            this.preco = preco;
            this.quantidadeEstoque = quantidadeEstoque;
        }

        @Override
        public void validarEstrutura() {
            System.out.println("Validando estrutura do arquivo de produtos...");
        }

        @Override
        public void lerDados() {
            System.out.println("Lendo dados do produto: " + descricao);
            System.out.println("Código: " + codigo);
            System.out.println("Preço: " + preco);
            System.out.println("Quantidade em estoque: " + quantidadeEstoque);
        }

        @Override
        public void processarDados() {
            System.out.println("Processando dados do produto: " + descricao);
        }
}