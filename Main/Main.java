package Main;
//importar a classe Scanner para ler a entrada do usuário
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scanner serve para ler dados digitados pelo usuário.
        Scanner scanner = new Scanner(System.in);

        //Variavel de controle para gurada a opção escolhida no menu
        int opcao = 0;

        //loop do programa
        while (opcao !=2){
            //menu
            System.out.println("==== Gerenciador de Gastos====");
            System.out.println("===============================");
            System.out.println("Aperte (1) para Adicionar gastos");
            System.out.println("Aperte (2) para  Sair");
            System.out.println("Aperte (3) para Ver total gasto");


            //ler a opção
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            //Consumir quebra de linha pendente
            scanner.nextLine();
            
            //condição caso o usuario escolha a opção 1
            if(opcao == 1){

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
                    System.out.println("Convertido para reais: " + valor);
                }

                Gastos gasto = new Gastos(descricao, valor, moeda);
                Salvar.salvar(gasto, null);

                System.out.println("Gasto salvo.");
                

                if (resposta.equalsIgnoreCase("s")) {
                        double cotacao = CotacaoService.buscarDolar();
                        valor = valor * cotacao;
                        System.out.println("Convertido para reais: " + valor);
                    }
            
            }else if (opcao == 2) {

                Leitor.listar();

            } else if (opcao == 3) {

                Leitor.mostrarTotal();
            }
        
        }
        //Fechar acanner
        scanner.close();
    
    }
}