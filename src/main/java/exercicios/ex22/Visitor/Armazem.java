package exercicios.ex22.Visitor;

public class Armazem implements Setor{
    String responsavel;
    int quantidadeFuncionarios;
    int quantidadeProdutos;
    boolean possuiMateriaisInflamaveis;
    boolean organizado;
    int nivelRisco;

    public Armazem(String responsavel, int quantidadeFuncionarios, int quantidadeProdutos, boolean possuiMateriaisInflamaveis, boolean organizado, int nivelRisco) {
        this.responsavel = responsavel;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.quantidadeProdutos = quantidadeProdutos;
        this.possuiMateriaisInflamaveis = possuiMateriaisInflamaveis;
        this.organizado = organizado;
        this.nivelRisco = nivelRisco;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public int getQuantidadeProdutos() {
        return quantidadeProdutos;
    }

    public void setQuantidadeProdutos(int quantidadeProdutos) {
        this.quantidadeProdutos = quantidadeProdutos;
    }

    public boolean isPossuiMateriaisInflamaveis() {
        return possuiMateriaisInflamaveis;
    }

    public void setPossuiMateriaisInflamaveis(boolean possuiMateriaisInflamaveis) {
        this.possuiMateriaisInflamaveis = possuiMateriaisInflamaveis;
    }

    public boolean isOrganizado() {
        return organizado;
    }

    public void setOrganizado(boolean organizado) {
        this.organizado = organizado;
    }

    public int getNivelRisco() {
        return nivelRisco;
    }

    public void setNivelRisco(int nivelRisco) {
        this.nivelRisco = nivelRisco;
    }

    @Override
    public void aceitar(VisitanteSetor visitanteSetor) {
        visitanteSetor.visitarArmazem(this);
    }
}
