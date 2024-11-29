public class Calculadora {
    static class Opera implements OperacaoMat{
        int soma;
        int multiplica;
        @Override
                public void  adicionar(int a, int b) {
                    soma = a + b;
        }
        @Override
                public void multi(int a, int b){
                    multiplica= a * b;

        }
    public void exibir(){
        System.out.println("soma:\n"+soma);
        System.out.println("multi:\n"+multiplica);
    }
    }

}
