package exercicios.ex09.proxy;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Usuario usuarioCarlos = new Usuario("Carlos", Plano.PREMIUM);
        Usuario usuarioAna = new Usuario("Ana", Plano.BASICO);
        Usuario usuarioMarina = new Usuario("Marina", Plano.PREMIUM);
        Usuario usuarioPedro = new Usuario("Pedro", Plano.BASICO);
        Usuario usuarioJoana = new Usuario("Joana", null);
        Conteudo filmePremiumProxy = new FilmePremiumProxy();

        List<Usuario> usuarios = List.of(usuarioCarlos, usuarioAna, usuarioMarina, usuarioPedro, usuarioJoana);

        for (Usuario usuario : usuarios) {
            try {
                System.out.println("Tentando assistir filme no perfil de Usuário: " + (usuario != null ? usuario.getNome() : "null"));
                filmePremiumProxy.assistir(usuario);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
             System.out.println();
        }

        System.out.println("Tentando assistir filme com usuário nulo:");
        try {
            filmePremiumProxy.assistir(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
