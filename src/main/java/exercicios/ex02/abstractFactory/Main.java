package exercicios.ex02.abstractFactory;

import exercicios.ex02.abstractFactory.fornecedores.FornecedorFactory;
import exercicios.ex02.abstractFactory.fornecedores.FornecedorInternacionalFactory;
import exercicios.ex02.abstractFactory.fornecedores.FornecedorNacionalFactory;
import exercicios.ex02.abstractFactory.service.CheckoutService;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FornecedorFactory factory;

        System.out.println("Escolha o tipo de fornecedor:");
        System.out.println("1 - Nacional");
        System.out.println("2 - Internacional");
        System.out.print("Digite aqui: ");

        int opcao = scanner.nextInt();

        System.out.println();

        if (opcao == 1) {
            factory = new FornecedorNacionalFactory();
        } else {
            factory = new FornecedorInternacionalFactory();
        }

        CheckoutService checkout = new CheckoutService(factory);

        List<String> pedidosId = Arrays.asList("P001", "P002");
        List<Integer> quantidade = Arrays.asList(2, 1);

        double valorProdutos = 150.0;
        double pesoKg = 3.5;
        String cepDestino = "58400-000";
        double valorPago = 200.0;

        checkout.finalizarCompra(
                pedidosId,
                quantidade,
                valorProdutos,
                pesoKg,
                cepDestino,
                valorPago
        );

        scanner.close();
    }

}