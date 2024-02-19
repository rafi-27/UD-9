package ejerciciosUD9.monopoli;

public abstract class propiedad extends casilla{
    protected final int precio;
    protected final int hipoteca;
    private int propietario;
    /**
     * Constructor para propiedad:
     * @param nombreCasilla
     * @param precio
     * @param hipoteca
     * @param propietario
     */
    public propiedad(String nombreCasilla, int precio, int hipotec) {
        super(nombreCasilla);
        this.precio = precio;
        this.hipoteca = hipotec;
        this.propietario=-1;
    }
    //Getter para propietario:
    public int getPropietario() {
        return propietario;
    }
    //setters:
    public void setPropietario(int propi){
        this.propietario=propi;
    }
    //Metodo abstracto getAlquiler:
    protected abstract double getAlquiler(int modificacion);
}