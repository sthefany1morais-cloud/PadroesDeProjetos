package exercicios.ex15.chainOfResponsability;

import exercicios.ex15.chainOfResponsability.middleware.*;
import exercicios.ex15.chainOfResponsability.requisicao.Permissao;
import exercicios.ex15.chainOfResponsability.requisicao.Requisicao;
import exercicios.ex15.chainOfResponsability.usuario.Usuario;

public class Main {
    public static void main(String[] args) {

        // Criando usuários
        Usuario admin = new Usuario("admin", "admin@gmail.com");

        // Configuração da cadeia de responsabilidade
        Middleware auth = new AuthMiddleware();
        Middleware permissao = new PermissaoMiddleware();
        Middleware validacao = new ValidacaoMiddleware();
        Middleware log = new LogMiddleware();
        Middleware controller = new ControllerMiddleware();

        auth.setProximo(permissao);
        permissao.setProximo(validacao);
        validacao.setProximo(log);
        log.setProximo(controller);

        // Cenário 1: Válido
        Requisicao req1 = new Requisicao(admin, "valido", Permissao.ADMIN, true);
        System.out.println("Cenário 1:");
        auth.processar(req1);
        System.out.println();

        // Cenário 2: Token inválido
        Requisicao req2 = new Requisicao(admin, null, Permissao.ADMIN, true);
        System.out.println("Cenário 2:");
        auth.processar(req2);
        System.out.println();

        // Cenário 3: Sem permissão
        Requisicao req3 = new Requisicao(admin, "valido", Permissao.USUARIO, true);
        System.out.println("Cenário 3:");
        auth.processar(req3);
        System.out.println();

        // Cenário 4: Dados inválidos
        Requisicao req4 = new Requisicao(admin, "valido", Permissao.ADMIN, false);
        System.out.println("Cenário 4:");
        auth.processar(req4);
    }
}