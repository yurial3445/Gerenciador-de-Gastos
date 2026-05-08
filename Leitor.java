import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leitor {

    public static void listar() {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("gastos.txt"));

            String linha;

            System.out.println("=== LISTA DE GASTOS ===");

            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo.");
        }
    }

    public static double mostrarTotal() {

        double total = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("gastos.txt"));

            String linha;

            while ((linha = reader.readLine()) != null) {

                String[] partes = linha.split("\\|");

                String valorTexto = partes[2]
                    .replace("R$", "")
                    .trim();

                double valor = Double.parseDouble(valorTexto);

                total += valor;
            }

            reader.close();

            System.out.println("Total gasto: R$ " + total);

        } catch (IOException e) {
            System.out.println("Erro ao calcular total.");
        }

        return total;
    }
}