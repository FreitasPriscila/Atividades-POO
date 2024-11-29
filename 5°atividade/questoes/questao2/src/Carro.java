public class Carro implements Veiculo{
    @Override
    public void acelerar(){
        System.out.println("Está em alta velocidade! ");
    }

    @Override
    public void frear() {
        System.out.println("Está parando! ");

    }
}
