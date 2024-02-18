package maraton;

public class Triangulo extends Figura2D_v3 {
    private String estilo;
    // private enum estilos{ISOSCELES, RECTANGULO, EQUILATERO};
    // estilos estilo;

    /**
     * Constructor para inicializar nuestros objetos tipo triangulo:
     * 
     * @param ancho
     * @param alto
     * @param estilo
     */
    public Triangulo(double ancho, double alto, String stile) {
        super(ancho, alto);
        // if (stile.equalsIgnoreCase("isosceles")||stile.equalsIgnoreCase("rectangulo")||stile.equalsIgnoreCase("equilatero")) {
        //     this.estilo = stile;
        // }else{
        //     this.estilo = "Sin estilo";
        // }
        this.estilo = stile;
    }

    /**
     * un método llamado área que devuelva la superficie del triángulo
     */

    public double area() {
        return ((getAncho()*getAlto())/2);
    }

    /**
     * Metodo para visualizar el valor de estilo:
     */
    public String verEstilo() {
        return "Estilo del Triangulo "+this.estilo;
    }
}