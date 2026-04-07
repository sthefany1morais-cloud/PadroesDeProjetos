package exercicios.ex11.bridge;

import exercicios.ex11.bridge.exportadores.Exportador;
import exercicios.ex11.bridge.exportadores.ExportadorExcel;
import exercicios.ex11.bridge.exportadores.ExportadorPDF;
import exercicios.ex11.bridge.relatorios.ItemRelatorio;
import exercicios.ex11.bridge.relatorios.Relatorio;
import exercicios.ex11.bridge.relatorios.RelatorioFinanceiro;
import exercicios.ex11.bridge.relatorios.RelatorioVendas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Exportador exportadorPDF = new ExportadorPDF();
        Exportador exportadorExcel = new ExportadorExcel();

        List<ItemRelatorio> itens = List.of(
                new ItemRelatorio("Produto A", 50),
                new ItemRelatorio("Produto B", 200),
                new ItemRelatorio("Produto C", 150)
        );

        RelatorioFinanceiro relatorioFinanceiroPDFSimples = new RelatorioFinanceiro(exportadorPDF);
        RelatorioFinanceiro relatorioFinanceiroExcelDetalhado = new RelatorioFinanceiro(exportadorExcel);
        RelatorioVendas relatorioVendasPDFDetalhado = new RelatorioVendas(exportadorPDF);
        RelatorioVendas relatorioVendasExcelSimples = new RelatorioVendas(exportadorExcel);

        List<Relatorio> relatorios = List.of(
                relatorioFinanceiroPDFSimples,
                relatorioFinanceiroExcelDetalhado,
                relatorioVendasPDFDetalhado,
                relatorioVendasExcelSimples);

        for (Relatorio relatorio : relatorios) {
            for (ItemRelatorio item : itens) {
                relatorio.adicionarItem(item);
            }
        }

        relatorioFinanceiroPDFSimples.gerar(false);
        System.out.println("\n-----------------------------");
        relatorioFinanceiroExcelDetalhado.gerar(true);
        System.out.println("\n-----------------------------");
        relatorioVendasPDFDetalhado.gerar(true);
        System.out.println("\n-----------------------------");
        relatorioVendasExcelSimples.gerar(false);

    }
}
