package exercicios.ex11.bridge.exportadores;

import exercicios.ex11.bridge.relatorios.ItemRelatorio;

import java.util.List;

public class ExportadorPDF implements Exportador {
    public ExportadorPDF() {
    }

    @Override
    public void exportar(String titulo, List<ItemRelatorio> itens, double total) {
        System.out.println("=== EXPORTANDO PDF ===");
        System.out.println("Título: " + titulo);
        System.out.println("Itens:");
        for (ItemRelatorio item : itens) {
            System.out.println("        - " + item.getDescricao() + " | R$ " + item.getValor());
        }
        System.out.println("Descrição: Este relatório apresenta as vendas do mês, detalhando os itens vendidos e o valor total.");
        System.out.println("Total: R$ " + total);
        System.out.println("======================");
    }
}