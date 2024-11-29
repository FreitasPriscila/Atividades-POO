public abstract class Funcionario {
    public String nome;
    public double salario;
    public Funcionario(String nome, double salario){
            this.nome=nome;
            this.salario=salario;
    }
    public abstract double calcBonificacao();

    public void exibir(){
        System.out.println("nome:\n"+nome);
        System.out.println("salario:\n"+salario);
        System.out.println("bonificacao:\n"+calcBonificacao());
    }
}
