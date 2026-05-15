package exercicios.ex22.Visitor;

public class AvaliacaoLimpeza implements VisitanteSetor {

    @Override
    public void visitarAdministrativo(Administrativo administrativo) {

        System.out.println("\n=== Avaliação de Limpeza: Administrativo ===");

        if (administrativo.isAmbienteLimpo()
                && administrativo.isDocumentosOrganizados()) {

            System.out.println("Setor administrativo está limpo e organizado.");

        } else {

            System.out.println("Setor administrativo precisa de organização e limpeza.");
        }
    }

    @Override
    public void visitarArmazem(Armazem armazem) {

        System.out.println("\n=== Avaliação de Limpeza: Armazém ===");

        if (armazem.isOrganizado()) {

            System.out.println("Armazém organizado e limpo.");

        } else {

            System.out.println("Armazém desorganizado. Necessita limpeza.");
        }
    }

    @Override
    public void visitarFrota(Frota frota) {

        System.out.println("\n=== Avaliação de Limpeza: Frota ===");

        if (frota.isPatioOrganizado()) {

            System.out.println("Pátio da frota está organizado.");

        } else {

            System.out.println("Pátio da frota precisa de limpeza e organização.");
        }
    }

    @Override
    public void visitarProducao(Producao producao) {

        System.out.println("\n=== Avaliação de Limpeza: Produção ===");

        if (producao.isSetorLimpo()) {

            System.out.println("Setor de produção está limpo.");

        } else {

            System.out.println("Setor de produção necessita limpeza.");
        }
    }
}