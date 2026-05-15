package exercicios.ex22.Visitor;

public interface VisitanteSetor {

    void visitarAdministrativo(Administrativo administrativo);
    void visitarArmazem(Armazem armazem);
    void visitarFrota(Frota frota);
    void visitarProducao(Producao producao);
}
