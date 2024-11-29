public class Gerente extends Funcionario{
    public Gerente(String nome, double salario){
        super(nome,salario);
    }
    @Override
    public double calcBonificacao(){

        return salario * 0.2;
    }
}
