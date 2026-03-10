package exercicios.ex02.abstractFactory.fornecedores;

import exercicios.ex02.abstractFactory.produtos.Frete;
import exercicios.ex02.abstractFactory.produtos.NotaFiscal;
import exercicios.ex02.abstractFactory.produtos.Pagamento;
import exercicios.ex02.abstractFactory.produtos.nacional.FreteNacional;
import exercicios.ex02.abstractFactory.produtos.nacional.NotaFiscalNacional;
import exercicios.ex02.abstractFactory.produtos.nacional.PagamentoNacional;

public class FornecedorNacionalFactory implements FornecedorFactory{
    @Override
    public Pagamento criarPagamento() {
        return new PagamentoNacional();
    }

    @Override
    public Frete criarFrete() {
        return new FreteNacional();
    }

    @Override
    public NotaFiscal criarNotaFiscal() {
        return new NotaFiscalNacional();
    }
}
