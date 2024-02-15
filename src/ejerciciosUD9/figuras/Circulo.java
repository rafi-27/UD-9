package ejerciciosUD9.figuras;

public class Circulo implements IFigura2D{
    //Tiene radio
    private double radio;
    //Editando desde github:
    //Constructor:
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    //Calcular el perimetro de un ciculo 2*PI*RADIO
    @Override
    public double perimetro() {
        return 2*Math.PI*radio;
    }
    //Calcular el area de un circulo PI*RADIO^2
    @Override
    public double area() {
        return Math.PI*Math.pow(radio, 2);
    }
    //Escalamos
    @Override
    public void escalar(double escala) {
        if (escala <=0) {
            System.err.println("Error la escala tiene que ser mayor a 0");
        }else{
            this.radio*=escala;
        }
    }
    //Mostrarmos la informacion:
    @Override
    public void imprimir() {
        System.out.println("Circulo de radio "+this.radio+" con un perimetro de "+perimetro()+" y un area de "+area());
    }
    

}
