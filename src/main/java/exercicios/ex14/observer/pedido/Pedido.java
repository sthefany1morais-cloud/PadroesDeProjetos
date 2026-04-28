package exercicios.ex14.observer.pedido;

import exercicios.ex14.observer.cliente.Cliente;
import exercicios.ex14.observer.observer.PedidoObserver;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements PedidoSubjec{
    private String id;
    private StatusPedido status;
    private Cliente cliente;
    private List<PedidoObserver> observers;

    public Pedido(String id, StatusPedido status, Cliente cliente) {
        this.id = id;
        this.status = status;
        this.cliente = cliente;
        this.observers = new ArrayList<>();
    }

    public void adicionarObserver(PedidoObserver observer) {
        observers.add(observer);
    }

    public void removerObserver(PedidoObserver observer) {
        observers.remove(observer);
    }

    public void notificarObservers() {
        for (PedidoObserver observer : observers) {
            observer.atualizar(this);
        }
    }

    @Override
    public void atualizarStatus(StatusPedido novoStatus) {
        this.status = novoStatus;
        notificarObservers();
    }

    public String getId() {
        return id;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<PedidoObserver> getObservers() {
        return observers;
    }
}