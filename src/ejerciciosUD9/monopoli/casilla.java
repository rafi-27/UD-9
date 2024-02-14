package ejerciciosUD9.monopoli;

public class casilla {
    private final String nombreCasilla;
    private final int codigo;
    private int contador=1;
    
    /**
     * Construimos el constructor y que aumente cada vez que se crea una casilla:
     * @param nombreCasilla
     * @param codigo
     */
    public casilla(String nombreCasilla) {
        this.nombreCasilla = nombreCasilla;
        this.codigo = contador;
        this.contador++;
    }

    //Generamos getters para poder acceder a los datos:
    public String getNombreCasilla() {
        return nombreCasilla;
    }
    public int getCodigo() {
        return codigo;
    }
}
