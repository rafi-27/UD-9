package ejerciciosUD9.agenda;

import java.util.ArrayList;

public class Agenda {
    /**
     * Una agenda de contactos está formada por un conjunto de contactos y debe permitir realizar las siguientes operaciones:
     */
    ArrayList<Contacto>listaDeContacto = new ArrayList<>();
    
    //Metodo: 
    //boolean añadirContacto(Contacto c): Añade un contacto a la agenda e indica si se ha añadido. No se pueden meter contactos que existan, es decir, no podemos duplicar nombres (aunque tengan distinto teléfono).
    boolean añadirContacto(Contacto c){
        for (Contacto contacto : listaDeContacto) {
            if (contacto.getNombre().equals(c.getNombre())) {
                return false;
            }
        }
        listaDeContacto.add(c);
        return true;
    }

    //Metodo:
    //boolean eliminarContacto(String nombre): elimina el contacto de la agenda. Indica si se ha podido eliminar.
    boolean eliminarContacto(String nombre){
        for (int i = 0; i < listaDeContacto.size(); i++) {
            if(listaDeContacto.get(i).getNombre().equalsIgnoreCase(nombre)){
                listaDeContacto.remove(i);
                return true;
            }   
        }
        return false;
    }

    //Metodo: 
    //boolean existeContacto(String nombre): Indica si el contacto indicado existe.
    boolean existeContacto(String nombre){
        for (Contacto contacto : listaDeContacto) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }

    //Metodo: 
    //void listarContactos(): Muestra por pantalla toda la agenda.
    void listarContactos(){
        for (Contacto contacto : listaDeContacto) {
            System.out.println(contacto);
        }
    }

    //Metodo: 
    //int buscaContacto(String nombre): busca un contacto por su nombre y devuelve su posición en la agenda
    int buscaContacto(String nombre){
        for (int i = 0; i < listaDeContacto.size(); i++) {
            if (listaDeContacto.get(i).getNombre().equals(nombre)) {
                return i;
            }
        }
        return 0;
    }
}
