
import java.time.LocalDateTime;
//Importa uma classe da biblioteca padrão do Java para trabalhar com data e hora.

public class Gastos {
//Variaveir para armazenar a descrição do gastos
        String descricao;
        double valor;
        LocalDateTime dataHora;

        //construtor
        public Gastos(String descricao, double valor) {
                        
            //atributo do objeto atual recebe o valor passado como argumento
            this.descricao = descricao;

            //atributo do objeto atual recebe o valor passado como argumento
            this.valor = valor;

            //atributo do objeto atual recebe a data e hora atual
            this.dataHora = LocalDateTime.now();
        }

    
}
