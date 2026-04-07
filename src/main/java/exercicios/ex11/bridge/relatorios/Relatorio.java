package exercicios.ex11.bridge.relatorios;

import exercicios.ex11.bridge.exportadores.Exportador;

import java.util.ArrayList;
import java.util.List;

public abstract class Relatorio {

    protected Exportador exportador;
    protected List<ItemRelatorio> itens;

    public Relatorio(Exportador exportador) {
        this.exportador = exportador;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemRelatorio item){
        itens.add(item);
    }

    protected double calcularTotal(){
        double total = 0;
        for (ItemRelatorio item : this.itens) {
            total += item.getValor();
        }
        return total;
    }

    protected double calcularTotal(List<ItemRelatorio> itens) {
        double total = 0;
        for (ItemRelatorio item : itens) {
            total += item.getValor();
        }
        return total;
    }

    protected List<ItemRelatorio> filtrarItensDetalhados(boolean detalhado){
        List<ItemRelatorio> itensFiltrados = new ArrayList<>();
        for (ItemRelatorio item : itens) {
            if (!detalhado || item.getValor() >= 100) {
                itensFiltrados.add(item);
            }
        }
        return itensFiltrados;
    }

    public abstract void gerar(boolean detalhado);

}