package exercicios.ex09.proxy;

public class FilmePremium implements Conteudo{

    public FilmePremium() {
    }

    @Override
    public void assistir(Usuario usuario) {
        System.out.println("Assistindo filme premium para o usuário: " + usuario.getNome());
    }
}
