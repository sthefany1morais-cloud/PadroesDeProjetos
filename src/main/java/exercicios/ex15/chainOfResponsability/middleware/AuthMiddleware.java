package exercicios.ex15.chainOfResponsability.middleware;

import exercicios.ex15.chainOfResponsability.requisicao.Requisicao;

public class AuthMiddleware extends Middleware {
    @Override
    public boolean processar(Requisicao req) {
        if (req.getToken() != null) {
            System.out.println("AUTH: Autenticação bem-sucedida para o usuário: " + req.getUsuario().getNome());

            if (proximo != null) {
                return proximo.processar(req);
            }

            return true;
        }
        else {
            System.out.println("AUTH: Token inválido → acesso negado");
            return false;
            
        }
    }
}
