package exercicios.ex02.abstractFactory.fornecedores;

import exercicios.ex02.abstractFactory.produtos.Frete;
import exercicios.ex02.abstractFactory.produtos.NotaFiscal;
import exercicios.ex02.abstractFactory.produtos.Pagamento;
import exercicios.ex02.abstractFactory.produtos.internacional.FreteInternacional;
import exercicios.ex02.abstractFactory.produtos.internacional.NotaFiscalInternacional;
import exercicios.ex02.abstractFactory.produtos.internacional.PagamentoInternacional;

public class FornecedorInternacionalFactory implements FornecedorFactory{

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoInternacional();
    }

    @Override
    public Frete criarFrete() {
        return new FreteInternacional();
    }

    @Override
    public NotaFiscal criarNotaFiscal() {
        return new NotaFiscalInternacional();
    }
}