package ejerciciosUD9.agenda;

public class ProgramaAgenda {
    public static void main(String[] args) {
        // Aqui vamos a realizar las pruebas de la agenda:
        //Creamos la agenda:
        Agenda primeraAgenda = new Agenda();
        //Creamos los contactos:
        primeraAgenda.añadirContacto(new ContactoPersona("Joselito", "25934865885"));
        ContactoEmpresa yoigo = new ContactoEmpresa("Yoigo", "698254187", "www.yoigo.com");
        ContactoEmpresa movistar = new ContactoEmpresa("Movistar", "587412365", "www.ies.thiar");

        ContactoPersona abdel = new ContactoPersona("Abdelilah", "789523471");
        ContactoPersona rafe = new ContactoPersona("Rafik Bachri Marouf", "663548789");


        //Procedemos a probar los metodos:
        //Añadir el contacto:
        primeraAgenda.añadirContacto(yoigo);
        primeraAgenda.añadirContacto(movistar);
        primeraAgenda.añadirContacto(abdel);
        primeraAgenda.añadirContacto(rafe);
        //--------------------------------//
        //Mostrar Lista entera:
        primeraAgenda.listarContactos();
        //--------------------------------//
        //Comprobar si existe el contacto:
        System.out.println((primeraAgenda.existeContacto("Yoigo"))?"Si existe":"No existe");
        //--------------------------------//
        //Borrar un contacto:
        System.out.println((primeraAgenda.eliminarContacto("yoigo"))?"Se ha borrado correctamente":"No se ha podido borrar el contacto.");        
        //--------------------------------//
        //Buscar el contacto
        System.out.println("Posicion del contacto: "+primeraAgenda.buscaContacto("Abdelilah"));
        //--------------------------------//
        //Volvemos a listar con las modificaciones:
        primeraAgenda.listarContactos();
    }

}
