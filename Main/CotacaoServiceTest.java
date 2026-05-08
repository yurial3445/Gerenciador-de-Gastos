package Main;
public class CotacaoServiceTest {

    public static void main(String[] args) {

        double cotacao = CotacaoService.buscarDolar();

        if (cotacao > 0) {
            System.out.println("Teste passou ");
            System.out.println("Cotação: " + cotacao);
        } else {
            System.out.println("Teste falhou ");
        }
    }
}