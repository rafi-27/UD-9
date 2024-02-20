package maraton.nuevePuntoTres;
public class figuraMaraton {
    public static void main(String[] args) {
        Triangulo uno = new Triangulo(5, 2.5, "Equilatero");;
        System.out.printf("Area de: %.2f",uno.area());
        System.out.println();
        uno.verDim();
        System.out.println(uno.verEstilo());
    }
}