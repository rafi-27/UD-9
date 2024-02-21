package ejerciciosUD9.ajedrez;
import java.awt.Point;
public abstract class pieza {
    //Creamos los atributos e importamos java.awt.Point para poder usar la clase point:
    public enum ColorPieza{BLANCO,NEGRO};
    private Point posicion = new Point();
    private ColorPieza colorpieza;
    private boolean comida;
    /**
     * ---------------Primer constructor---------------------
     * Constructor para crear una pieza asignarla en una posicion del tablero.
     * @param x coordenada x
     * @param y coordenada y
     * @param colorpieza color de la pieza
     * @param comida si esa posicion ha sido comida.
     */
    public pieza(int x, int y, ColorPieza colorpieza) {
        this.posicion=new Point(x, y);
        this.colorpieza = colorpieza;
        if (comprobarPosicion(x)&&comprobarPosicion(y)) {
            this.comida=false;
        }else{
            this.comida=true;
        }
    }

    /**
     * ---------------Segundo constructor---------------------
     * El segundo, que deberá usar el primero, no recibirá ningún parámetro 
     * y creará una nueva Pieza en la posición 10, 10 y de color BLANCO.
     */
    public pieza(){
        this(10,10,ColorPieza.BLANCO);
    }

    /**
     * ---------------Tercer constructor---------------------
     * El tercero, que usará el primero, 
     * recibe como parámetro una Pieza, y copiará sus atributos a la nueva Pieza,
     */
    public pieza(pieza piezaTercerConst){
        this(piezaTercerConst.posicion.x, piezaTercerConst.posicion.y, piezaTercerConst.colorpieza);
    }

     //Getters y setters
    public Point getPosicion() {
        return posicion;
    }
    public void setPosicion(Point posicion) {
        this.posicion = posicion;
    }
    public ColorPieza getColorpieza() {
        return colorpieza;
    }
    public void setColorpieza(ColorPieza colorpieza) {
        this.colorpieza = colorpieza;
    }
    public boolean isComida() {
        return comida;
    }

    public void setComida(boolean comida) {
        this.comida = comida;
    }

    //Hashcode
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((posicion == null) ? 0 : posicion.hashCode());
        result = prime * result + ((colorpieza == null) ? 0 : colorpieza.hashCode());
        return result;
    }
    
    /**
     * Para saber si una pieza es igual a otra se comprueba que:
     * 1. Misma clase
     * 2. Mismo color
     * 3. Misma posicion
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        pieza other = (pieza) obj;
        if (posicion == null) {
            if (other.posicion != null)
                return false;
        } else if (!posicion.equals(other.posicion))
            return false;
        if (colorpieza != other.colorpieza)
            return false;
        return true;
    }

    //Metodos
    /**
     * comprobarPosicion comprobará si el número que se le pasa como parámetro 
     * está dentro de los límites establecidos, entre 0 y 7 y 
     * devolverá verdadero si está en los límites o falso en caso contrario.
     * @param p
     * @return true si esta en el rango o false si no lo esta.
     */
     static boolean comprobarPosicion(int p){
        if (p <= 7 && p > 0) {
            return true;
        }
        return false;
    }

    /**
     * Crear el métodos públicos y abstracto:
     */
    abstract void mover(int x,int y);
    
}
