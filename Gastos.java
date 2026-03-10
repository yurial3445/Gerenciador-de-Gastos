import java.util.ArrayList;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Gastos {

        String descricao;
        double valor;
        LocalDateTime dataHora;

        //construtor
        public Gastos(String descricao, double valor) {
            this.descricao = descricao;
            this.valor = valor;
            this.dataHora = LocalDateTime.now();
        }

    
}
