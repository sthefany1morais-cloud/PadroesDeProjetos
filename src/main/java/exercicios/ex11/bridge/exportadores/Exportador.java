package exercicios.ex11.bridge.exportadores;

import exercicios.ex11.bridge.relatorios.ItemRelatorio;

import java.util.List;

public interface Exportador {

    void exportar(String titulo, List<ItemRelatorio> itens, double total);
}
