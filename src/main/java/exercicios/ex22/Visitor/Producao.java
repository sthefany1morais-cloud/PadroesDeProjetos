package exercicios.ex22.Visitor;

public class Producao implements Setor{
    String encarregado;
    int quantidadeMaquinas;
    int quantidadeFuncionarios;
    boolean usoEPIs;
    boolean setorLimpo;
    int nivelRisco;

    public Producao(String encarregado, int quantidadeMaquinas, int quantidadeFuncionarios, boolean usoEPIs, boolean setorLimpo, int nivelRisco) {
        this.encarregado = encarregado;
        this.quantidadeMaquinas = quantidadeMaquinas;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.usoEPIs = usoEPIs;
        this.setorLimpo = setorLimpo;
        this.nivelRisco = nivelRisco;
    }

    public String getEncarregado() {
        return encarregado;
    }

    public void setEncarregado(String encarregado) {
        this.encarregado = encarregado;
    }

    public int getQuantidadeMaquinas() {
        return quantidadeMaquinas;
    }

    public void setQuantidadeMaquinas(int quantidadeMaquinas) {
        this.quantidadeMaquinas = quantidadeMaquinas;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public boolean isUsoEPIs() {
        return usoEPIs;
    }

    public void setUsoEPIs(boolean usoEPIs) {
        this.usoEPIs = usoEPIs;
    }

    public boolean isSetorLimpo() {
        return setorLimpo;
    }

    public void setSetorLimpo(boolean setorLimpo) {
        this.setorLimpo = setorLimpo;
    }

    public int getNivelRisco() {
        return nivelRisco;
    }

    public void setNivelRisco(int nivelRisco) {
        this.nivelRisco = nivelRisco;
    }

    @Override
    public void aceitar(VisitanteSetor visitanteSetor) {
        visitanteSetor.visitarProducao(this);
    }
}
