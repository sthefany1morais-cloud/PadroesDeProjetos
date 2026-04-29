package exercicios.ex15.chainOfResponsability.middleware;

import exercicios.ex15.chainOfResponsability.requisicao.Requisicao;

public class ValidacaoMiddleware extends Middleware {
    @Override
    public boolean processar(Requisicao req) {
        if (req.isDadosValidos()) {
            System.out.println("VALIDAÇÃO: Validação bem-sucedida para o usuário: " + req.getUsuario().getNome());

            if (proximo != null) {
                return proximo.processar(req);
            }

            return true;

        } else {
            System.out.println("VALIDAÇÃO: Dados inválidos");
            return false;
        }
    }
}
