import java.time.LocalDate;
public abstract class Pagamento {
    double valor;
    LocalDate data;
    public Pagamento(double valor, LocalDate data) {
        this.valor = valor;
        this.data = data;
    }
    public abstract void ProcessarPag();
    public void exibir(){
        System.out.println("Valor:\n"+valor);
        System.out.println("Data:\n"+data);
    }


}
