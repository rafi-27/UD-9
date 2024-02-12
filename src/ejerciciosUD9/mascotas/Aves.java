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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((pico == null) ? 0 : pico.hashCode());
        result = prime * result + (vuela ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aves other = (Aves) obj;
        if (pico == null) {
            if (other.pico != null)
                return false;
        } else if (!pico.equals(other.pico))
            return false;
        if (vuela != other.vuela)
            return false;
        return true;
    }



    
}
