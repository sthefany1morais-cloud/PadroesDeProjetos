package exercicios.ex15.chainOfResponsability.middleware;

import exercicios.ex15.chainOfResponsability.requisicao.Permissao;
import exercicios.ex15.chainOfResponsability.requisicao.Requisicao;

public class PermissaoMiddleware extends Middleware {

    @Override
    public boolean processar(Requisicao req) {
        if (req.getPermissao() == Permissao.ADMIN) {
            System.out.println("PERMISSÃO: Permissão bem-sucedida para o usuário: " + req.getUsuario().getNome());

            if (proximo != null) {
                return proximo.processar(req);
            }

            return true;
        } else {
            System.out.println("PERMISSÃO: Acesso negado");
            return false;

        }
    }
}
