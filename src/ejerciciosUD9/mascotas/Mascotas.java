package ejerciciosUD9.mascotas;

public abstract class Mascotas {
    protected String nombreDelAnimar;
    protected int edad;
    protected String estado;//Vivo o Muerto
    protected String fechaNacimiento;
    /**
     * Constructor con los datos del los atributos:
     * @param nombreDelAnimar
     * @param edad
     * @param estado
     * @param fechaNacimiento
     */
    public Mascotas(String nombreDelAnimar, int edad, String estado, String fechaNacimiento) {
        this.nombreDelAnimar = nombreDelAnimar;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
    }


    /**
     * Getters y setters
     * @return
     */
    public String getNombreDelAnimar() {
        return nombreDelAnimar;
    }
    public void setNombreDelAnimar(String nombreDelAnimar) {
        this.nombreDelAnimar = nombreDelAnimar;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Metodos:
     */
        //System.out.println("Nombre de la mascota: "+this.nombreDelAnimar);
        // System.out.println("Edad de la mascota: "+this.edad);
        // System.out.println("Estado del animal: "+this.estado);
        // System.out.println("Fecha de nacimiento: "+this.fechaNacimiento);
     
     /**
      * Abstracto
      */
     public abstract void muestra();


     void cumpleaños(){
        System.out.println(this.fechaNacimiento);
     }

     void morir(){
        setEstado("Muerto");
     }

     void habla(){

     }

}
