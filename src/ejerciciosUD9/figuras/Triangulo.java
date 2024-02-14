package ejerciciosUD9.figuras;

public class Triangulo implements IFigura2D {
    // Tiene ancho u alto
    private int ancho;
    private int alto;

    /**
     * Constructor de triangulo
     * @param ancho
     * @param alto
     */
    public Triangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    /**
     * Teorema de pitagoras
     * c^2=altura^2+ancho^2
     * c=a raiz cuadrada de la suma de la altura y anchura elevados a dos.
     * //lado = Math.pow(alto)+Math.pow(ancho);
     */
    // Calcular el perimetro de un
    @Override
    public double perimetro() {
        return Math.sqrt(Math.pow(ancho, 2) + Math.pow(alto, 2));
    }

    // Calcular el area de un cuadrado base(ancho)*altura(alto)/2
    @Override
    public double area() {
        return (ancho * alto) / 2;
    }

    // Escalamos:
    @Override
    public void escalar(double escala) {
        if (escala <= 0) {
            System.err.println("Error la escala tiene que ser mayor a 0");
        } else {
            this.alto *= escala;
            this.ancho *= escala;
        }

    }

    // Mostramos informacion
    @Override
    public void imprimir() {
        System.out.println("Triangulo de altura " + this.alto + " anchura " + this.ancho + " perimetro de "
                + perimetro() + " area de " + area());
    }
}
