package exercicios.ex15.chainOfResponsability.middleware;

import exercicios.ex15.chainOfResponsability.requisicao.Requisicao;

public abstract class Middleware {
    protected Middleware proximo;

    public Middleware setProximo(Middleware proximo) {
        this.proximo = proximo;
        return proximo;
    }

    public abstract boolean processar(Requisicao req);
}
