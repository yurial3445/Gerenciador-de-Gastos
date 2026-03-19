import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class Salvar{

    public static void salvar(Gastos gasto) {

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        try {

            FileWriter writer = new FileWriter("gastos.txt", true);

            writer.write(
                gasto.dataHora.format(formato) + " | " +
                gasto.descricao + " | R$ " +
                gasto.valor + "\n"
            );

            writer.close();

        } catch (IOException e) {
            System.out.println("Erro ao salvar gasto.");
        }
    }
}