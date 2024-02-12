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


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombreDelAnimar == null) ? 0 : nombreDelAnimar.hashCode());
        result = prime * result + edad;
        result = prime * result + ((estado == null) ? 0 : estado.hashCode());
        result = prime * result + ((fechaNacimiento == null) ? 0 : fechaNacimiento.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Mascotas other = (Mascotas) obj;
        if (nombreDelAnimar == null) {
            if (other.nombreDelAnimar != null)
                return false;
        } else if (!nombreDelAnimar.equals(other.nombreDelAnimar))
            return false;
        if (edad != other.edad)
            return false;
        if (estado == null) {
            if (other.estado != null)
                return false;
        } else if (!estado.equals(other.estado))
            return false;
        if (fechaNacimiento == null) {
            if (other.fechaNacimiento != null)
                return false;
        } else if (!fechaNacimiento.equals(other.fechaNacimiento))
            return false;
        return true;
    }

     

}
