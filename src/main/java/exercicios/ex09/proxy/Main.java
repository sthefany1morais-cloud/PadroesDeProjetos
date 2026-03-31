package exercicios.ex09.proxy;

public class Main {
    public static void main(String[] args) {
        Usuario usuarioCarlos = new Usuario("Carlos", Plano.PREMIUM);
        Usuario usuarioAna = new Usuario("Ana", Plano.BASICO);
        Usuario usuarioMarina = new Usuario("Marina", Plano.PREMIUM);
        Usuario usuarioPedro = new Usuario("Pedro", Plano.BASICO);
        Usuario usuarioNull = null;
        Conteudo filmePremiumProxy = new FilmePremiumProxy();

        System.out.println("Tentando assistir com Carlos (Plano Premium):");
        filmePremiumProxy.assistir(usuarioCarlos);

        System.out.println("\nTentando assistir com Ana (Plano Básico):");
        filmePremiumProxy.assistir(usuarioAna);

        System.out.println("\nTentando assistir com Marina (Plano Premium):");
        filmePremiumProxy.assistir(usuarioMarina);

        System.out.println("\nTentando assistir com Pedro (Plano Básico):");
        filmePremiumProxy.assistir(usuarioPedro);

        System.out.println("\nTentando assistir com usuário nulo:");
        try {
            filmePremiumProxy.assistir(usuarioNull);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: O usuário não pode ser nulo.");
        }
    }
}
