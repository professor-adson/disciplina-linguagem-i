package aula2;

public class Teste {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro();
        Cachorro c2 = new Cachorro();
        c1.correr();
        c2.raca = "pitbull";
        System.out.println(c2.raca);

//        c1.emitirSom("au au");
//        Cachorro.emitirSom("au au au");
//        Cachorro.correr();
    }
}
