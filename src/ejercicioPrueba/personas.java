package ejercicioPrueba;

import java.util.ArrayList;

abstract public class personas {
    protected String nombre;
    protected String apellidos;
    protected String DNI;
    protected String direccion;
    protected static ArrayList<personas>listado = new ArrayList<>();
    /**
     * @param nombre
     * @param apellidos
     * @param dNI
     * @param direccion
     */
    public personas(String nombre, String apellidos, String dNI, String direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        DNI = dNI;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
        result = prime * result + ((DNI == null) ? 0 : DNI.hashCode());
        result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
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
        personas other = (personas) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (apellidos == null) {
            if (other.apellidos != null)
                return false;
        } else if (!apellidos.equals(other.apellidos))
            return false;
        if (DNI == null) {
            if (other.DNI != null)
                return false;
        } else if (!DNI.equals(other.DNI))
            return false;
        if (direccion == null) {
            if (other.direccion != null)
                return false;
        } else if (!direccion.equals(other.direccion))
            return false;
        return true;
    }

    public static void aniadir(personas p){
        listado.add(p);
    }

     /**
     * Metodo para mostrar los datos:
     */
    @Override
    public String toString() {
        return "personas [nombre=" + nombre + ", apellidos=" + apellidos + ", DNI=" + DNI + ", direccion=" + direccion
                + "]";
    }

   public static void mostrarTodo(){
    for (personas persona : listado) {
        System.out.println(persona.toString());
    }
   }

     
}
