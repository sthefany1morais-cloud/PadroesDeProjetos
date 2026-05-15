package exercicios.ex22.Visitor;

public class Frota implements Setor{
    String supervisor;
    int quantidadeVeiculos;
    int veiculosComManutencaoAtrasada;
    boolean patioOrganizado;
    boolean possuiEquipamentosSeguranca;
    int nivelRisco;

    public Frota(String supervisor, int quantidadeVeiculos, int veiculosComManutencaoAtrasada, boolean patioOrganizado, boolean possuiEquipamentosSeguranca, int nivelRisco) {
        this.supervisor = supervisor;
        this.quantidadeVeiculos = quantidadeVeiculos;
        this.veiculosComManutencaoAtrasada = veiculosComManutencaoAtrasada;
        this.patioOrganizado = patioOrganizado;
        this.possuiEquipamentosSeguranca = possuiEquipamentosSeguranca;
        this.nivelRisco = nivelRisco;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public int getQuantidadeVeiculos() {
        return quantidadeVeiculos;
    }

    public void setQuantidadeVeiculos(int quantidadeVeiculos) {
        this.quantidadeVeiculos = quantidadeVeiculos;
    }

    public int getVeiculosComManutencaoAtrasada() {
        return veiculosComManutencaoAtrasada;
    }

    public void setVeiculosComManutencaoAtrasada(int veiculosComManutencaoAtrasada) {
        this.veiculosComManutencaoAtrasada = veiculosComManutencaoAtrasada;
    }

    public boolean isPatioOrganizado() {
        return patioOrganizado;
    }

    public void setPatioOrganizado(boolean patioOrganizado) {
        this.patioOrganizado = patioOrganizado;
    }

    public boolean isPossuiEquipamentosSeguranca() {
        return possuiEquipamentosSeguranca;
    }

    public void setPossuiEquipamentosSeguranca(boolean possuiEquipamentosSeguranca) {
        this.possuiEquipamentosSeguranca = possuiEquipamentosSeguranca;
    }

    public int getNivelRisco() {
        return nivelRisco;
    }

    public void setNivelRisco(int nivelRisco) {
        this.nivelRisco = nivelRisco;
    }

    @Override
    public void aceitar(VisitanteSetor visitanteSetor) {
        visitanteSetor.visitarFrota(this);
    }
}
