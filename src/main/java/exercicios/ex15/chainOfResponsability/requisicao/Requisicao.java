package exercicios.ex15.chainOfResponsability.requisicao;

import exercicios.ex15.chainOfResponsability.usuario.Usuario;

public class Requisicao {
    private Usuario usuario;
    private String token;
    private Permissao permissao;
    private boolean dadosValidos;

    public Requisicao(Usuario usuario, String token, Permissao permissao, boolean dadosValidos) {
        this.usuario = usuario;
        this.token = token;
        this.permissao = permissao;
        this.dadosValidos = dadosValidos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getToken() {
        return token;
    }

    public Permissao getPermissao() {
        return permissao;
    }

    public boolean isDadosValidos() {
        return dadosValidos;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setPermissao(Permissao permissao) {
        this.permissao = permissao;
    }

    public void setDadosValidos(boolean dadosValidos) {
        this.dadosValidos = dadosValidos;
    }
}