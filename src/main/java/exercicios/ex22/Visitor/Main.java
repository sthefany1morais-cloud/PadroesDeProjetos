package exercicios.ex22.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Criando os setores
        Armazem armazem = new Armazem(
                "Carlos",
                15,
                500,
                true,
                false,
                8
        );

        Administrativo administrativo = new Administrativo(
                "Fernanda",
                20,
                8,
                true,
                false,
                3
        );

        Frota frota = new Frota(
                "Ricardo",
                12,
                2,
                false,
                false,
                7
        );

        Producao producao = new Producao(
                "Juliana",
                25,
                40,
                true,
                true,
                4
        );

        // Coleção de setores
        List<Setor> setores = new ArrayList<>();

        setores.add(armazem);
        setores.add(administrativo);
        setores.add(frota);
        setores.add(producao);

        // Criando visitantes
        VisitanteSetor inspecaoSeguranca = new InspecaoSeguranca();
        VisitanteSetor avaliacaoLimpeza = new AvaliacaoLimpeza();

        // Aplicando inspeção de segurança
        System.out.println("===== INSPEÇÃO DE SEGURANÇA =====");

        for (Setor setor : setores) {

            setor.aceitar(inspecaoSeguranca);
        }

        // Aplicando avaliação de limpeza
        System.out.println("\n===== AVALIAÇÃO DE LIMPEZA =====");

        for (Setor setor : setores) {

            setor.aceitar(avaliacaoLimpeza);
        }
    }
}