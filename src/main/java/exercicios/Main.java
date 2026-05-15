package exercicios;

import java.util.Scanner;

public class Main {

    // ==================================================
    // MÉTODO 1
    // Responsável apenas por iniciar o processo
    // ==================================================
    static long contarQuantidadeDeInversoes(int[] numeros) {

        int[] vetorAuxiliar = new int[numeros.length];

        return dividirEContar(
                numeros,
                vetorAuxiliar,
                0,
                numeros.length - 1
        );
    }

    // ==================================================
    // MÉTODO 2
    // Divide o vetor recursivamente
    // ==================================================
    static long dividirEContar(
            int[] numeros,
            int[] vetorAuxiliar,
            int inicio,
            int fim
    ) {

        // ----------------------------------------------
        // CASO BASE
        // ----------------------------------------------
        if (inicio >= fim) {
            return 0;
        }

        int meio = (inicio + fim) / 2;

        long quantidadeDeInversoes = 0;

        // ----------------------------------------------
        // Conta inversões da esquerda
        // ----------------------------------------------
        quantidadeDeInversoes += dividirEContar(
                numeros,
                vetorAuxiliar,
                inicio,
                meio
        );

        // ----------------------------------------------
        // Conta inversões da direita
        // ----------------------------------------------
        quantidadeDeInversoes += dividirEContar(
                numeros,
                vetorAuxiliar,
                meio + 1,
                fim
        );

        // ----------------------------------------------
        // Conta inversões cruzadas
        // ----------------------------------------------
        quantidadeDeInversoes += juntarEContar(
                numeros,
                vetorAuxiliar,
                inicio,
                meio,
                fim
        );

        return quantidadeDeInversoes;
    }

    // ==================================================
    // MÉTODO 3
    // Junta os vetores e conta inversões
    // ==================================================
    static long juntarEContar(
            int[] numeros,
            int[] vetorAuxiliar,
            int inicio,
            int meio,
            int fim
    ) {

        int ponteiroEsquerda = inicio;

        int ponteiroDireita = meio + 1;

        int ponteiroAuxiliar = inicio;

        long quantidadeDeInversoes = 0;

        // ----------------------------------------------
        // Enquanto houver elementos dos dois lados
        // ----------------------------------------------
        while (
                ponteiroEsquerda <= meio &&
                        ponteiroDireita <= fim
        ) {

            // ------------------------------------------
            // Se o elemento da esquerda é menor
            // ------------------------------------------
            if (
                    numeros[ponteiroEsquerda]
                            <=
                            numeros[ponteiroDireita]
            ) {

                vetorAuxiliar[ponteiroAuxiliar] =
                        numeros[ponteiroEsquerda];

                ponteiroEsquerda++;
            }

            // ------------------------------------------
            // Encontramos inversões
            // ------------------------------------------
            else {

                vetorAuxiliar[ponteiroAuxiliar] =
                        numeros[ponteiroDireita];

                ponteiroDireita++;

                quantidadeDeInversoes +=
                        (meio - ponteiroEsquerda + 1);
            }

            ponteiroAuxiliar++;
        }

        // ----------------------------------------------
        // Copia o restante da esquerda
        // ----------------------------------------------
        while (ponteiroEsquerda <= meio) {

            vetorAuxiliar[ponteiroAuxiliar] =
                    numeros[ponteiroEsquerda];

            ponteiroEsquerda++;
            ponteiroAuxiliar++;
        }

        // ----------------------------------------------
        // Copia o restante da direita
        // ----------------------------------------------
        while (ponteiroDireita <= fim) {

            vetorAuxiliar[ponteiroAuxiliar] =
                    numeros[ponteiroDireita];

            ponteiroDireita++;
            ponteiroAuxiliar++;
        }

        // ----------------------------------------------
        // Copia para o vetor original
        // ----------------------------------------------
        for (int i = inicio; i <= fim; i++) {
            numeros[i] = vetorAuxiliar[i];
        }

        return quantidadeDeInversoes;
    }

    // ==================================================
    // MAIN
    // ==================================================
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        while (true) {

            int quantidadeDeElementos =
                    leitor.nextInt();

            // ------------------------------------------
            // Fim da entrada
            // ------------------------------------------
            if (quantidadeDeElementos == 0) {
                break;
            }

            int[] numeros =
                    new int[quantidadeDeElementos];

            // ------------------------------------------
            // Lê vetor
            // ------------------------------------------
            for (int i = 0;
                 i < quantidadeDeElementos;
                 i++) {

                numeros[i] = leitor.nextInt();
            }

            // ------------------------------------------
            // Conta inversões
            // ------------------------------------------
            long quantidadeDeInversoes =
                    contarQuantidadeDeInversoes(numeros);

            // ------------------------------------------
            // Decide vencedor
            // ------------------------------------------
            if (quantidadeDeInversoes % 2 == 1) {
                System.out.println("Marcelo");
            } else {
                System.out.println("Carlos");
            }
        }

        leitor.close();
    }
}