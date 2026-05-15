package exercicios.ex22.Visitor;

public class InspecaoSeguranca implements VisitanteSetor {

    @Override
    public void visitarAdministrativo(Administrativo administrativo) {

        System.out.println("\n=== Inspeção de Segurança: Administrativo ===");

        if (administrativo.getQuantidadePendencias() > 5) {

            System.out.println("Muitas pendências encontradas no administrativo.");

        } else {

            System.out.println("Administrativo dentro dos padrões de segurança.");
        }
    }

    @Override
    public void visitarArmazem(Armazem armazem) {

        System.out.println("\n=== Inspeção de Segurança: Armazém ===");

        if (armazem.isPossuiMateriaisInflamaveis()
                && armazem.getNivelRisco() > 7) {

            System.out.println("Armazém apresenta alto risco por materiais inflamáveis.");

        } else {

            System.out.println("Armazém seguro.");
        }
    }

    @Override
    public void visitarFrota(Frota frota) {

        System.out.println("\n=== Inspeção de Segurança: Frota ===");

        if (frota.getVeiculosComManutencaoAtrasada() > 0) {

            System.out.println("Existem veículos com manutenção atrasada.");

        } else {

            System.out.println("Todos os veículos estão regularizados.");
        }

        if (!frota.isPossuiEquipamentosSeguranca()) {

            System.out.println("Frota sem equipamentos de segurança adequados.");
        }
    }

    @Override
    public void visitarProducao(Producao producao) {

        System.out.println("\n=== Inspeção de Segurança: Produção ===");

        if (producao.isUsoEPIs()
                && producao.getNivelRisco() <= 5) {

            System.out.println("Produção operando com segurança.");

        } else {

            System.out.println("Produção apresenta riscos de segurança.");
        }
    }
}