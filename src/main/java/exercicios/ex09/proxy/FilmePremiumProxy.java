package exercicios.ex09.proxy;

public class FilmePremiumProxy implements Conteudo{
    private FilmePremium filmePremium;

    public FilmePremiumProxy() {
        this.filmePremium = new FilmePremium();
    }

    @Override
    public void assistir(Usuario usuario) throws IllegalArgumentException {
        if (usuario == null) {
            throw new IllegalArgumentException();
        }
        else if (usuario.getPlano() == Plano.PREMIUM) {
            filmePremium.assistir(usuario);
        } else {
            System.out.println("Acesso negado. O filme premium está disponível apenas para usuários com plano premium.");
        }
    }

}
