package exercicios.ex09.proxy;

public class FilmePremiumProxy implements Conteudo{
    private FilmePremium filmePremium;

    public FilmePremiumProxy() {
        this.filmePremium = new FilmePremium();
    }

    @Override
    public void assistir(Usuario usuario){
        if (usuario == null) {
            throw new IllegalArgumentException("O usuário não pode ser nulo.");
        } else if (usuario.getPlano() == Plano.PREMIUM) {
            System.out.println("Acesso concedido. O usuário " + usuario.getNome() + " tem plano premium.");
            filmePremium.assistir(usuario);
        } else if (usuario.getPlano() == Plano.BASICO) {
            throw new IllegalArgumentException("Acesso negado. O filme premium está disponível apenas para usuários com plano premium.");
        } else {
            throw new IllegalArgumentException("Plano desconhecido. Acesso negado.");
        }
    }
}
