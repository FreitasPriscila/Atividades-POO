public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario){
        super(nome,salario);
    }
    @Override
    public double calcBonificacao(){

        return salario * 0.4;
    }
}
