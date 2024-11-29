public class Triangulo extends Forma{
    float base, altura;
    @Override
    public double calc_area(){
        return (base * altura)/2;
    }
}
