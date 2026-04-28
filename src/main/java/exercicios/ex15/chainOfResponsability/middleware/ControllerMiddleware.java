package exercicios.ex15.chainOfResponsability.middleware;

import exercicios.ex15.chainOfResponsability.requisicao.Requisicao;

public class ControllerMiddleware extends Middleware {

    @Override
    public boolean processar(Requisicao req) {
        System.out.println("CONTROLLER: Requisição processada com sucesso");
        return true;
    }
}