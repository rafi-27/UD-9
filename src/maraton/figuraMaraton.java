package maraton;

public class figuraMaraton {
    public static void main(String[] args) {
        Triangulo uno = new Triangulo(5, 2.5, "Equilatero");

        System.out.println(uno.area());
        uno.verDim();
        System.out.println(uno.verEstilo());
    }
}