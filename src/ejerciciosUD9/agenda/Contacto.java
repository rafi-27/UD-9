package ejerciciosUD9.agenda;

public abstract class Contacto {
    //Atributos:
    private String nombre;
    private String numeroTelefono;
    
    /**
     * Constructor para inicializar un contacto:
     * @param nombre
     * @param numeroTelefono
     */
     public Contacto(String nombre, String numeroTelefono) {
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
    }
    /**
     * Getters y setters para obtener los datos:
     */
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNumeroTelefono() {
        return numeroTelefono;
    }
    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    //Metodo EQUALS:
    //Se considera que dos contactos son iguales si sus nombres son iguales.
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((numeroTelefono == null) ? 0 : numeroTelefono.hashCode());
        return result;
    }
    //Modifico el equals para que solo compare el nombre:
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contacto other = (Contacto) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Contacto nombre=" + nombre + ", Numero telefono=" + numeroTelefono;
    }
}
