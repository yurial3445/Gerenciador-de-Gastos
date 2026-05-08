package Main;
import java.time.LocalDateTime;

public class Gastos {

    String descricao;
    double valor;
    LocalDateTime dataHora;
    String moeda; // "BRL" ou "USD"

    // construtor atualizado
    public Gastos(String descricao, double valor, String moeda) {

        this.descricao = descricao;
        this.valor = valor;
        this.moeda = moeda;
        this.dataHora = LocalDateTime.now();
    }
}