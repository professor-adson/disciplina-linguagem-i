package aula8;

public class TesteExternaInterna {
    public static void main(String[] args) {
        Externa e = new Externa();
        Externa.Interna i = e.new Interna();

        System.out.println(i.y);
    }
}
