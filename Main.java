import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 4) {

            System.out.println("==== Gerenciador de Gastos ====");
            System.out.println("1 - Adicionar gasto");
            System.out.println("2 - Listar gastos");
            System.out.println("3 - Ver total gasto");
            System.out.println("4 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {

                System.out.print("Descrição: ");
                String descricao = scanner.nextLine();

                System.out.print("Valor: ");
                double valor = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("O valor está em dólar? (s/n): ");
                String resposta = scanner.nextLine();

                String moeda = "BRL";

                if (resposta.equalsIgnoreCase("s")) {

                    double cotacao = CotacaoService.buscarDolar();

                    valor = valor * cotacao;
                    moeda = "USD";

                    System.out.println(
                        "Convertido para reais: R$ " + valor
                    );
                }

                Gastos gasto = new Gastos(descricao, valor, moeda);

                Salvar.salvar(gasto);

                System.out.println("Gasto salvo.");

            } else if (opcao == 2) {

                Leitor.listar();

            } else if (opcao == 3) {

                Leitor.mostrarTotal();

            } else if (opcao == 4) {

                System.out.println("Encerrando sistema...");
            }
        }

        scanner.close();
    }
}