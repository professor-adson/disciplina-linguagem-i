package prova;

class C1 {
    static String message() { return "x"; }
}

class C2 extends C1 {
    public static void main(String[] args) {
        System.out.println(message());
    }
    // POR POLIMORFISMO, ESSE MÉTODO SOBRESCREVE O DA CLASSE PAI
    static String message() { return "y"; }
}


