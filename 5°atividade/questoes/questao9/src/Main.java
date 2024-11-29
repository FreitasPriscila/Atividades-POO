import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        PagamentoCartao pg = new PagamentoCartao(200, LocalDate.now());
        System.out.println("Pagamento com cartão: \n");
        pg.exibir();
        pg.ProcessarPag();
        pg.autorizar();
        pg.extornar();
        PagamentoBoleto pb = new PagamentoBoleto(400, LocalDate.now());
        System.out.println("Pagamento Boleto: \n");
        pb.ProcessarPag();
        pb.exibir();

    }
}