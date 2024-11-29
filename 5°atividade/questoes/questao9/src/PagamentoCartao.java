import java.time.LocalDate;
public class PagamentoCartao extends Pagamento implements Cartao{
    public PagamentoCartao(double valor, LocalDate data){
        super(valor, data);
    }
    @Override
    public void ProcessarPag(){
        System.out.println("Pagamento Processado! ");
    }
    @Override
    public void autorizar(){
        System.out.println("Pagemento autorizado! ");
    }
    @Override
    public void extornar(){
        System.out.println("oi");
    }
}
