public class Bicicleta implements Veiculo{
    @Override
    public void acelerar(){
        System.out.println("Está pedalando bastante! ");
    }
    @Override
    public void frear(){
        System.out.println("Está colocando o pé no chão! ");
    }

}
