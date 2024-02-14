package ejerciciosUD9.vehiculos.vehiculos_aereos;

public class avion extends vehiculos_aereos{
    private double tiempoMaximoVuelo;

    /**
     * Constructor para avion:
     * @param matricula
     * @param modelo
     * @param numeroAsientos
     * @param tiempoMaximoVuelo
     */
    public avion(String matricula, String modelo, int numeroAsientos, double tiempoMaximoVuelo) {
        super(matricula, modelo, numeroAsientos);
        this.tiempoMaximoVuelo = tiempoMaximoVuelo;
    }
    //Setters y Getters
    public double getTiempoMaximoVuelo() {
        return tiempoMaximoVuelo;
    }
    public void setTiempoMaximoVuelo(double tiempoMaximoVuelo) {
        this.tiempoMaximoVuelo = tiempoMaximoVuelo;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Este avion tiene un tiempo de "+this.tiempoMaximoVuelo+" de vuelo.");
    }
}
