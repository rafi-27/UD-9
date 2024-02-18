package maraton.nuevePuntoTres;
public class Figura2D_v3 {
    //atributos:
    private double ancho;
    private double alto;

    /**
     * Constructor para inicializar nuestros objetos.
     * @param ancho
     * @param alto
     */
    public Figura2D_v3(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    /**
     * Metodos que devolveran los datos del objeto y tambien poder modificarlo:
     * @return
     */
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    //Metodo para visualizar sus dimensiones:
    void verDim(){
        System.out.println("Ancho: "+this.ancho+"\nAlto: "+this.alto);
    }
}
