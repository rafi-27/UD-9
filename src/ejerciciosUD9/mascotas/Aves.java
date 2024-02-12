package ejerciciosUD9.mascotas;

public abstract class Aves extends Mascotas{
    protected String pico;
    protected boolean vuela;

    /**
     * Constructor de aves
     * @param nombreDelAnimar
     * @param edad
     * @param estado
     * @param fechaNacimiento
     * @param pico
     * @param vuela
     */
    public Aves(String nombreDelAnimar, int edad, String estado, String fechaNacimiento, String pico, boolean vuela) {
        super(nombreDelAnimar, edad, estado, fechaNacimiento);
        this.pico = pico;
        this.vuela = vuela;
    }
    
    /**
     * Getters y setters
     */
    public String getPico() {
        return pico;
    }

    public void setPico(String pico) {
        this.pico = pico;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }


    /**
     * Metodos:
     * @return
     */
    public abstract boolean volar();

    public abstract void muestra();



    
}
