package ejerciciosUD9.mascotas;

public class Gato extends Mascotas{
    private enum color{MARRON, BLANCO, NEGRO}
    private boolean peloLargo;
    private color queColor;
    /**
     * Constructor para gato
     * @param nombreDelAnimar
     * @param edad
     * @param estado
     * @param fechaNacimiento
     * @param tienePeloLargo
     * @param color
     */
    public Gato(String nombreDelAnimar, int edad, String estado, String fechaNacimiento, boolean tienePeloLargo, color color) {
        super(nombreDelAnimar, edad, estado, fechaNacimiento);
        this.peloLargo=tienePeloLargo;
        this.queColor=color;
    }
    
    /**
     * Getters y setters
     */
    public boolean isPeloLargo() {
        return peloLargo;
    }
    public void setPeloLargo(boolean peloLargo) {
        this.peloLargo = peloLargo;
    }
    public color getQueColor() {
        return queColor;
    }
    public void setQueColor(color queColor) {
        this.queColor = queColor;
    }

    @Override
    public void muestra() {
        System.out.println("Nombre de la mascota: "+this.nombreDelAnimar);
        System.out.println("Edad de la mascota: "+this.edad);
        System.out.println("Estado del animal: "+this.estado);
        System.out.println("Fecha de nacimiento: "+this.fechaNacimiento);
        System.out.println((this.peloLargo)?"Esta mascota tiene pelo largo":"Esta mascota no tiene pelo largo");
        System.out.println("Tiene un color: "+this.queColor);
    }

    public void habla(){
        System.out.println("Maullido");
    } 
}
