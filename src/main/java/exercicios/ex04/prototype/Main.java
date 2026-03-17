package exercicios.ex04.prototype;

import exercicios.ex04.prototype.base.Prova;
import exercicios.ex04.prototype.base.Questao;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Questao q1 = new Questao("Q1", "O que é Java?", 2.0f);
        Questao q2 = new Questao("Q2", "Explique o padrão Prototype.", 3.0f);
        Questao q3 = new Questao("Q3", "O que é orientação a objetos?", 5.0f);

        List<Questao> questoes = new ArrayList<>();
        questoes.add(q1);
        questoes.add(q2);
        questoes.add(q3);

        Prova provaOriginal = new Prova(
                "Prova 1",
                "POO",
                "17/03/2026",
                "A",
                "Prof. Miqueias Soares Cardoso",
                questoes
        );

        System.out.println("=== PROVA ORIGINAL ===");
        System.out.println(provaOriginal);

        Prova provaCopia = provaOriginal.copiar();
        provaCopia.setVersao("B");

        Questao novaQuestao = new Questao("Q2", "Defina padrão de projeto Prototype.", 3.0f);
        provaCopia.substituirQuestao("Q2", novaQuestao);

        provaCopia.adicionarQuestao(new Questao("Q4", "O que é encapsulamento?", 2.0f));

        provaCopia.removerQuestao("Q1");

        System.out.println("\n=== PROVA CÓPIA (MODIFICADA) ===");
        System.out.println(provaCopia);

        System.out.println("\n=== PROVA ORIGINAL (DEPOIS DAS ALTERAÇÕES) ===");
        System.out.println(provaOriginal);
    }
}