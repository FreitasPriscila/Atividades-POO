public class Main {
    public static void main(String[] args) {

        Gerente g = new Gerente("patricia",2000);
        Desenvolvedor d = new Desenvolvedor("Robin",4000);
        System.out.println("Gerente:\n");
        g.exibir();
        System.out.println("Desenvolvedor:\n");
        d.exibir();
    }
}