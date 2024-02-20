package ejerciciosUD9.agenda;

public class ContactoEmpresa extends Contacto{
    //Atributo que tienen las empresas.
    private String paginaWeb;

    /**
     * Constructo para contacto de la empresa:
     * @param nombre
     * @param numeroTelefono
     * @param paginaWeb
     */
    public ContactoEmpresa(String nombre, String numeroTelefono, String paginaWeb) {
        super(nombre, numeroTelefono);
        this.paginaWeb = paginaWeb;
    }

    //Datos de la pagina web:
    public String getPaginaWeb() {
        return paginaWeb;
    }

    @Override
    public String toString() {
        return super.toString()+" pagina Web=" + paginaWeb;
    }

    
}
