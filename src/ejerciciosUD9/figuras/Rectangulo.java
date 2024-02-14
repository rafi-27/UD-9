package ejerciciosUD9.figuras;

public class Rectangulo implements IFigura2D {
    // Tiene ancho y alto:
    private int ancho, alto;

    /**
     * Constructor de Rectangulo
     * @param ancho
     * @param alto
     */
    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    // Perimetro Lan+Lan+Lal+Lal
    @Override
    public double perimetro() {
        return alto + alto + ancho + ancho;
    }

    // Area Lan*Lal
    @Override
    public double area() {
        return alto * ancho;
    }

    // Escalamos
    @Override
    public void escalar(double escala) {
        if (escala <= 0) {
            System.err.println("Error la escala tiene que ser mayor a 0");
        } else {

            this.alto *= escala;
            this.ancho *= escala;
        }
    }

    // Mostrarmos informacion
    @Override
    public void imprimir() {
        System.out.println("Rectangulo de " + this.alto + " alto y un ancho de " + this.ancho + " con un perimetro de "
                + perimetro() + " y area " + area());
    }

}
