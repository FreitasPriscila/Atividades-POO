public class Main {
    public static void main(String[] args) {

 Forma[] f= new Forma[3];
 Circulo c= new Circulo();
 c.raio=5;
 Retangulo r = new Retangulo();
 r.lado1=8;
 r.lado2=9;
 Triangulo t = new Triangulo();
 t.altura=6;
 t.base=9;
 f[0]= c;
 f[1]=r;
 f[2]=t;
        for (int i = 0; i < f.length; i++) {
            System.out.println("Área da forma " + (i + 1) + ": " + f[i].calc_area());
        }
    }
}