package ejerciciosUD9.vehiculos.vehiculos_aereos;

public class helicoptero extends vehiculos_aereos{
    private int numeroHelices;

    /**
     * Constructor helicopteros
     * @param matricula
     * @param modelo
     * @param numeroAsientos
     * @param numeroHelices
     */
    public helicoptero(String matricula, String modelo, int numeroAsientos, int numeroHelices) {
        super(matricula, modelo, numeroAsientos);
        this.numeroHelices = numeroHelices;
    }

    //Getters y Setters
    public int getNumeroHelices() {
        return numeroHelices;
    }
    public void setNumeroHelices(int numeroHelices) {
        this.numeroHelices = numeroHelices;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Este helicoptero tiene "+this.numeroHelices+" helices.");
    }
}
