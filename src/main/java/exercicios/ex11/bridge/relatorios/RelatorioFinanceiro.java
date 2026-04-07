package exercicios.ex11.bridge.relatorios;

import exercicios.ex11.bridge.exportadores.Exportador;

import java.util.List;

public class RelatorioFinanceiro extends Relatorio {

    public RelatorioFinanceiro(Exportador exportador) {
        super(exportador);
        this.exportador = exportador;
    }

    @Override
    public void gerar(boolean detalhado){
            String titulo = "Relatório Financeiro";
            List<ItemRelatorio> itensFiltrados = filtrarItensDetalhados(detalhado);
            double total = calcularTotal(itensFiltrados);
            exportador.exportar(titulo, itensFiltrados, total);
    }
}
