public class Circulo extends Forma{
    float raio;
    @Override
    public double calc_area(){
        return (float) (Math.PI* Math.pow(raio,2));
    }
}
