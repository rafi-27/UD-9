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
}
