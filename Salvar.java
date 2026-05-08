import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

import Main.Gastos;

public class Salvar{

    public static void salvar(Gastos gasto ,Leitor leitor) {

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        double total = Leitor.mostrarTotal();

        try {

            FileWriter writer = new FileWriter("gastos.txt", true);

            writer.write(

                
                gasto.dataHora.format(formato) + " | " +
                gasto.descricao + " | R$ " +
                gasto.valor + "\n"
                
                
                
            );
           FileWriter writer1 = new FileWriter("total.txt");

            writer1.write("Total gasto: R$ " + total);

            writer1.close();
            writer.close();

        } catch (IOException e) {
            System.out.println("Erro ao salvar.");
        }
    }
}