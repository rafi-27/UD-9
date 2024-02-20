package ejerciciosUD9.agenda;

import java.time.LocalDate;

public class ContactoPersona extends Contacto{
    private LocalDate cumpleanos;

    /**
     * Constructor para clase contacto de persona:
     * @param nombre
     * @param numeroTelefono
     * @param cumpleanos
     */
    public ContactoPersona(String nombre, String numeroTelefono) {
        super(nombre, numeroTelefono);
        this.cumpleanos = LocalDate.now();
    }

    /**
     * @return Un getter para devolver la fecha:
     */
    public LocalDate getCumpleanos() {
        return cumpleanos;
    }

    @Override
    public String toString() {
        return super.toString()+ " cumpleanos=" + cumpleanos;
    }

    
}
