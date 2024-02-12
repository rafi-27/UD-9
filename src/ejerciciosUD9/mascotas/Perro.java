package ejerciciosUD9.mascotas;

public class Perro extends Mascotas{
    
    private String raza;
    private boolean pulgas;

    public Perro(String nombreDelAnimar, int edad, String estado, String fechaNacimiento, String raza, boolean tienePulgas) {
        super(nombreDelAnimar, edad, estado, fechaNacimiento);
        this.raza=raza;
        this.pulgas=tienePulgas;
    }

    /**
     * Sobreescribimos los metodos de la clase abstracta:
     */
    @Override
    public void muestra() {
        System.out.println("Nombre de la mascota: "+this.nombreDelAnimar);
        System.out.println("Raza de la mascota: "+this.raza);
        System.out.println("Edad de la mascota: "+this.edad);
        System.out.println("Estado del animal: "+this.estado);
        System.out.println("Fecha de nacimiento: "+this.fechaNacimiento);
        System.out.println((this.pulgas)?"Tiene pulgas.":"No tiene pulgas.");
    }

    public void habla(){
        System.out.println("Ladrar");
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((raza == null) ? 0 : raza.hashCode());
        result = prime * result + (pulgas ? 1231 : 1237);
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
        Perro other = (Perro) obj;
        if (raza == null) {
            if (other.raza != null)
                return false;
        } else if (!raza.equals(other.raza))
            return false;
        if (pulgas != other.pulgas)
            return false;
        return true;
    }
    
}
