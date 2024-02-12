package ejerciciosUD9.mascotas.aves;

import ejerciciosUD9.mascotas.Aves;

public class Loro extends Aves{
    String origen;
    String habla;
    /**
     * Constructor
     * @param nombreDelAnimar
     * @param edad
     * @param estado
     * @param fechaNacimiento
     * @param pico
     * @param vuela
     * @param origen
     * @param habla
     */
    public Loro(String nombreDelAnimar, int edad, String estado, String fechaNacimiento, String pico, boolean vuela,
            String origen, String habla) {
        super(nombreDelAnimar, edad, estado, fechaNacimiento, pico, vuela);
        this.origen = origen;
        this.habla = habla;
    }
    @Override
    public void muestra() {
        System.out.println("Nombre de la mascota: "+this.nombreDelAnimar);
        System.out.println("Edad de la mascota: "+this.edad);
        System.out.println("Estado del animal: "+this.estado);
        System.out.println("Fecha de nacimiento: "+this.fechaNacimiento);
        System.out.println("Tiene el tipo de pico: "+this.pico);
        System.out.println((this.vuela)?"Esta mascota vuela":"Esta mascota no vuela");
        System.out.println("Hablar: "+this.habla);
    }

    @Override
    public boolean volar() {
        if (this.vuela) {
            return true;
        }
        return false;
    }

    public void saluda(){
        System.out.println("Hola Loro");
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((origen == null) ? 0 : origen.hashCode());
        result = prime * result + ((habla == null) ? 0 : habla.hashCode());
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
        Loro other = (Loro) obj;
        if (origen == null) {
            if (other.origen != null)
                return false;
        } else if (!origen.equals(other.origen))
            return false;
        if (habla == null) {
            if (other.habla != null)
                return false;
        } else if (!habla.equals(other.habla))
            return false;
        return true;
    }
    
}
