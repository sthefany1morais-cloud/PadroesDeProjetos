package exercicios.ex22.Visitor;

public class Administrativo implements Setor{
    String gerente;
    int quantidadeFuncionarios;
    int quantidadeSalas;
    boolean documentosOrganizados;
    boolean ambienteLimpo;
    int quantidadePendencias;

    public Administrativo(String gerente, int quantidadeFuncionarios, int quantidadeSalas, boolean documentosOrganizados, boolean ambienteLimpo, int quantidadePendencias) {
        this.gerente = gerente;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.quantidadeSalas = quantidadeSalas;
        this.documentosOrganizados = documentosOrganizados;
        this.ambienteLimpo = ambienteLimpo;
        this.quantidadePendencias = quantidadePendencias;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public int getQuantidadeSalas() {
        return quantidadeSalas;
    }

    public void setQuantidadeSalas(int quantidadeSalas) {
        this.quantidadeSalas = quantidadeSalas;
    }

    public boolean isDocumentosOrganizados() {
        return documentosOrganizados;
    }

    public void setDocumentosOrganizados(boolean documentosOrganizados) {
        this.documentosOrganizados = documentosOrganizados;
    }

    public boolean isAmbienteLimpo() {
        return ambienteLimpo;
    }

    public void setAmbienteLimpo(boolean ambienteLimpo) {
        this.ambienteLimpo = ambienteLimpo;
    }

    public int getQuantidadePendencias() {
        return quantidadePendencias;
    }

    public void setQuantidadePendencias(int quantidadePendencias) {
        this.quantidadePendencias = quantidadePendencias;
    }

    @Override
    public void aceitar(VisitanteSetor visitanteSetor) {
        visitanteSetor.visitarAdministrativo(this);
    }
}
