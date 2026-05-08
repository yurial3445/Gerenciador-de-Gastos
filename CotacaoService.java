import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CotacaoService {

    public static double buscarDolar() {

        try {
            URL url = new URL("https://economia.awesomeapi.com.br/json/last/USD-BRL");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(
                new InputStreamReader(conn.getInputStream())
            );

            String linha;
            StringBuilder resposta = new StringBuilder();

            while ((linha = reader.readLine()) != null) {
                resposta.append(linha);
            }

            reader.close();

            String json = resposta.toString();
            String valor = json.split("\\\"bid\\\":\\\"")[1].split("\\\"")[0];

            return Double.parseDouble(valor);

        } catch (Exception e) {
            e.printStackTrace();
            return 0.0;
        }
    }
}