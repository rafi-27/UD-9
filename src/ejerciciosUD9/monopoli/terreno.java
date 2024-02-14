package ejerciciosUD9.monopoli;

public class terreno extends propiedad{
    private double precioAlquiler;
    public enum ColorTerreno{ROJO,AMARILLO,VERDE};
    private ColorTerreno colorElejido;
    
    /**
     * Constructor para terreno
     * @param nombreCasilla
     * @param precio
     * @param hipoteca
     * @param propietario
     * @param precioAlquiler
     * @param colorElejido
     */
    public terreno(String nombreCasilla, int precio, int hipoteca, double precioAlquiler,
            ColorTerreno colorElejido) {
        super(nombreCasilla, precio, hipoteca);
        this.precioAlquiler = precioAlquiler;
        this.colorElejido = colorElejido;
    }

    //Getters y setters para poder acceder a los datos y cambiarlos si es necesario:
    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public ColorTerreno getColorElejido() {
        return colorElejido;
    }

    public void setColorElejido(ColorTerreno colorElejido) {
        this.colorElejido = colorElejido;
    }

    //Metodo para calcular el precio del alquiler:
    @Override
    public double getAlquiler(int modificacion) {
        if (modificacion > 4) {
            return this.precioAlquiler*10;
        }else{
            return getPrecioAlquiler()*modificacion;
        }
    }
}
