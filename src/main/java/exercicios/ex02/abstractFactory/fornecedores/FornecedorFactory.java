package exercicios.ex02.abstractFactory.fornecedores;

import exercicios.ex02.abstractFactory.produtos.Frete;
import exercicios.ex02.abstractFactory.produtos.NotaFiscal;
import exercicios.ex02.abstractFactory.produtos.Pagamento;

public interface FornecedorFactory {

    public Pagamento criarPagamento();
    public Frete criarFrete();
    public NotaFiscal criarNotaFiscal();
}
