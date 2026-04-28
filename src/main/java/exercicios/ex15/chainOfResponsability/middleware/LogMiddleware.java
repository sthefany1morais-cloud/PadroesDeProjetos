package exercicios.ex15.chainOfResponsability.middleware;

import exercicios.ex15.chainOfResponsability.requisicao.Requisicao;

public class LogMiddleware extends Middleware {

    @Override
    public boolean processar(Requisicao req) {
        System.out.println("LOG: Requisição processada");
        if (proximo != null) {
            return proximo.processar(req);
        }
        return true;
    }
}