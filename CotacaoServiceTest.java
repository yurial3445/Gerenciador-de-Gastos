public class CotacaoServiceTest {

    public static void main(String[] args) {

        double cotacao = CotacaoService.buscarDolar();

        System.out.println("Valor retornado: " + cotacao);

        if (cotacao > 0) {
            System.out.println("Teste passou");
        } else {
            System.out.println("Teste falhou");
        }
    }
}