package ejerciciosUD9.mascotas.aves;

import ejerciciosUD9.mascotas.Aves;

public class Canario extends Aves{
    public enum colores{ROJO,VERDE,AMARILLO,ROSA}
    private colores colorElejido;
    private boolean canta;
    /**
     * Constructor para canario
     * @param nombreDelAnimar
     * @param edad
     * @param estado
     * @param fechaNacimiento
     * @param pico
     * @param vuela
     * @param colorElejido
     * @param canta
     */
    public Canario(String nombreDelAnimar, int edad, String estado, String fechaNacimiento, String pico, boolean vuela,
            colores colorElejido, boolean canta) {
        super(nombreDelAnimar, edad, estado, fechaNacimiento, pico, vuela);
        this.colorElejido = colorElejido;
        this.canta = canta;
    }

    /**
     * Getters y Setters
     */
    public colores getColorElejido() {
        return colorElejido;
    }
    public void setColorElejido(colores colorElejido) {
        this.colorElejido = colorElejido;
    }
    public boolean isCanta() {
        return canta;
    }
    public void setCanta(boolean canta) {
        this.canta = canta;
    }

    /**
     * Metodos:
     */
    @Override
    public boolean volar() {
        if (this.vuela) {
            return true;
        }
        return false;
    }

    @Override
    public void muestra() {
        System.out.println("Nombre de la mascota: "+this.nombreDelAnimar);
        System.out.println("Edad de la mascota: "+this.edad);
        System.out.println("Estado del animal: "+this.estado);
        System.out.println("Fecha de nacimiento: "+this.fechaNacimiento);
        System.out.println("Tiene el tipo de pico: "+this.pico);
        System.out.println((this.vuela)?"Esta mascota vuela":"Esta mascota no vuela");
        System.out.println((this.canta)?"Puede cantar":"No puede cantar");
        System.out.println("Es de color: "+this.colorElejido);
    }

    public void habla(){
        System.out.println("El loro canta");
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((colorElejido == null) ? 0 : colorElejido.hashCode());
        result = prime * result + (canta ? 1231 : 1237);
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
        Canario other = (Canario) obj;
        if (colorElejido != other.colorElejido)
            return false;
        if (canta != other.canta)
            return false;
        return true;
    }    


}
