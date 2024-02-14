package ejerciciosUD9.vehiculos;

public abstract class vehiculos {
    private final String matricula;
    private final String modelo;
    
    /**
     * Constructor vehiculos:
     * @param matricula
     * @param modelo
     */
    public vehiculos(String matricula, String modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
    }

    /**
     * Generamos los Getters solo
     * @return
     */
    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    /**
     * Metodo para obligar a que todas las clases de vehiculos tengan este metodo:
     */
    public abstract void imprimir();
}
