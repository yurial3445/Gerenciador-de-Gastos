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

                Gastos gasto = new Gastos(descricao, valor);
                
                System.out.println("Gasto salvo.");
            
            
            }
        
        }
        //Fechar acanner
        scanner.close();
    
    }
}