package ejerciciosUD9.figuras;

public class Cuadrado implements IFigura2D{
    //Tiene todos sus lados iguales:
    private int lado;

    /**
     * Constructor de Cuadrado
     * @param lado
     */
    public Cuadrado(int lado) {
        this.lado = lado;
    }
    //Calcular el perimetro de un cuadrado L+L+L+L
    @Override
    public double perimetro() {
        return lado+lado+lado+lado;
    }
    //Calcular el area de un cuadrado L*L
    @Override
    public double area() {
        return lado*lado;
    }
    //Escalamos
    @Override
    public void escalar(double escala) {
        if (escala <= 0) {
            System.err.println("Error la escala tiene que ser mayor a 0");
        } else {
            this.lado*=escala;
        }
    }
    @Override
    public void imprimir() {
        System.out.println("Cuadrado de lados: "+this.lado+" con un perimetro de "+perimetro()+" un area de "+area());
    }
}
