package ejerciciosUD9.monopoli;

public abstract class propiedad extends casilla{
    private final int precio;
    private final int hipoteca;
    private int propietario;
    /**
     * Constructor para propiedad:
     * @param nombreCasilla
     * @param precio
     * @param hipoteca
     * @param propietario
     */
    public propiedad(String nombreCasilla, int precio, int hipoteca) {
        super(nombreCasilla);
        this.precio = precio;
        this.hipoteca = hipoteca;
        this.propietario = -1;
    }
    //Getter para propietario:
    public int getPropietario() {
        return propietario;
    }
    public int getPrecio(){
        return this.precio;
    }
    //Metodo abstracto getAlquiler:
    public abstract double getAlquiler(int modificacion);
}
