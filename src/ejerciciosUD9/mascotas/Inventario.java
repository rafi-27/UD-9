package ejerciciosUD9.mascotas;

import java.util.ArrayList;
import java.util.Scanner;
import ejerciciosUD9.mascotas.aves.Canario;
import ejerciciosUD9.mascotas.aves.Loro;

public class Inventario {
    /**
     * Main
     * @param args
     */
    public static void main(String[] args) {
        Inventario nuevaTienda = new Inventario();
        ArrayList<Mascotas> lista = new ArrayList<>();

        //Procedemos a crear un animal de cada tipo:
        Perro perro = new Perro("pepe", 23, "muerto", "275478","pastor aleman", false);
        Gato gato = new Gato("jose", 23, "muerto", "275478",true, Gato.color.NEGRO);
        Aves pajaro = new Canario("abdeli", 23123, "vivo", "254865","doblao", false, Canario.colores.ROJO, true);
        //Añadimos los animales ala lista:
        lista.add(perro);
        lista.add(gato);
        lista.add(pajaro);

        nuevaTienda.miniMenu(lista);

    }    


    /**
     * Tendremos un switch aqui:
     */

    public static void menu(){
        System.out.println("1.Mostrar lista animales(tipo y nombre)\n2.Mostrar datos de un animal en concreto\n"+
        "3.Mostrar todos los datos de todos los animales.\n4.Insertar animales al inventario\n5.Eliminar animales del inventario\n"+
        "6.Vaciar el inventario");
    }

     public void miniMenu(ArrayList<Mascotas> listaDeMascotas){
        Scanner sc = new Scanner(System.in);
        menu();
        boolean salir=true;
        while (salir) {
            String opcion = sc.next();
            while (!opcion.matches("[123456]+")) {
                System.err.println("Error vuelva a introducir el numero: ");
                opcion = sc.nextLine();
            }
            switch (Integer.parseInt(opcion)) {
                case 1:
                    mostrarAnimalPorTipoYnombre(listaDeMascotas);   
                    break;
                case 2:
                System.out.println("Nombre del animal: ");
                    sc.nextLine();
                    String nombreAnimal=sc.nextLine();
                    mostrarAnimalEnConcreto(listaDeMascotas, nombreAnimal);     
                    break;
                case 3:
                    mostrarTodoLosDatos(listaDeMascotas);
                    break;
                case 4:
                    insertarAnimal(listaDeMascotas);
                    break;
                case 5:
                System.out.println("Inserta el nombre del animal: ");
                String nombreAnimalAborrar = sc.nextLine();
                sc.nextLine();
                    eliminarMascota(listaDeMascotas, nombreAnimalAborrar);
                    break;
                case 6:
                    listaDeMascotas.clear();
                    break;
                case 7:
                System.out.println("Adeu");
                    salir = false;
                    break;
            }
        }
        sc.close();
     }

     /**
      * Metodos
      * @param lista
      */
     void mostrarAnimalPorTipoYnombre(ArrayList<Mascotas> lista){
        for (Mascotas mascota : lista) {
            System.out.println(mascota.getClass().getSimpleName()+" "+mascota.nombreDelAnimar);
        }
        menu();
     }
     void mostrarAnimalEnConcreto(ArrayList<Mascotas> lista, String name){
        for (Mascotas mascotas : lista) {
            if (mascotas.nombreDelAnimar.equalsIgnoreCase(name)) {
                mascotas.muestra();
                return; // Terminar la función después de encontrar el animal
            }
        }
        // Si no se encuentra el animal
        System.out.println("No se encontró ningún animal con ese nombre.");
    }

     void mostrarTodoLosDatos(ArrayList<Mascotas> lista){
        for (Mascotas mascota : lista) {
            mascota.muestra();
        }
     }

     void insertarAnimal(ArrayList<Mascotas> lista){
        System.out.println("1.Perro\n2.Gato\n3.Aves");
        Scanner teclado = new Scanner(System.in);
        int tipoAnimal = teclado.nextInt();
        teclado.nextLine();
        switch (tipoAnimal) {
            case 1:
                System.out.println("Nombre: ");
                String name = teclado.nextLine();
                System.out.println("Estado: ");
                String estado = teclado.nextLine();
                System.out.println("Edad: ");
                String edad = teclado.nextLine();
                System.out.println("Fecha fallecimiento: ");
                String fecha = teclado.nextLine();
                System.out.println("Raza: ");
                String raza = teclado.nextLine();
                System.out.println("Tiene pulgas?: ");
                String tienePulgasOno = teclado.nextLine();
                boolean siOno;
                if (tienePulgasOno.equalsIgnoreCase("si")) {
                    siOno=true;
                }else{
                    siOno=false;
                }
                lista.add(new Perro(name, Integer.parseInt(edad), estado, fecha, raza,siOno));
                menu();
                break;
            case 2:
            System.out.println("Nombre: ");
            name = teclado.nextLine();
            System.out.println("Estado: ");
            estado = teclado.nextLine();
            System.out.println("Edad: ");
            edad = teclado.nextLine();
            System.out.println("Fecha fallecimiento: ");
            fecha = teclado.nextLine();
            System.out.println("Raza: ");
            raza = teclado.nextLine();
            System.out.println("Tiene pelo largo?: ");
            String tienePeloLargo = teclado.nextLine();
            siOno=false;
                if (tienePeloLargo.equalsIgnoreCase("si")) {
                    siOno=true;
                }else{
                    siOno=false;
                }
            System.out.println("Color: ");
            lista.add(new Gato(name, Integer.parseInt(edad), estado, fecha, siOno, Gato.color.BLANCO));
            menu();    
            break;
            case 3:
            System.out.println("Que tipo de ave 1.Canario\n2.Loro");
            int cual = teclado.nextInt();
            switch (cual) {
                case 1:
                System.out.println("Nombre: ");
                name = teclado.nextLine();
                System.out.println("Estado: ");
                estado = teclado.nextLine();
                System.out.println("Edad: ");
                edad = teclado.nextLine();
                System.out.println("Fecha fallecimiento: ");
                fecha = teclado.nextLine();
                System.out.println("Origen: ");
                String origen = teclado.nextLine();
                System.out.println("Pico: ");
                String tipoPico = teclado.nextLine();
                System.out.println("Vuela?: ");
                String vuela = teclado.nextLine();
                siOno=false;
                if (vuela.equalsIgnoreCase("si")) {
                    siOno=true;
                }else{
                    siOno=false;
                }
                System.out.println("Habla: ");
                String habla = teclado.nextLine();
                lista.add(new Loro(name, Integer.parseInt(edad), estado, fecha,tipoPico,siOno, origen, habla));
                menu();
                break;
                case 2:
                System.out.println("Nombre: ");
                name = teclado.nextLine();
                System.out.println("Estado: ");
                estado = teclado.nextLine();
                System.out.println("Edad: ");
                edad = teclado.nextLine();
                System.out.println("Fecha fallecimiento: ");
                fecha = teclado.nextLine();
                System.out.println("Origen: ");
                origen = teclado.nextLine();
                System.out.println("Pico: ");
                tipoPico = teclado.nextLine();
                System.out.println("Vuela?: ");
                vuela = teclado.nextLine();
                siOno=false;
                if (vuela.equalsIgnoreCase("si")) {
                    siOno=true;
                }else{
                    siOno=false;
                }
                System.out.println("Habla: ");
                habla = teclado.nextLine();
                lista.add(new Loro(name, Integer.parseInt(edad), estado, fecha, tipoPico, siOno, origen, habla));
                menu();
                break;
                default:
                System.err.println("Opcion invalida.");
                menu();    
                break;
            }
                break;
            default:
                System.err.println("Opcion incorrecta.");
                menu();
                break;
        }
     }

     public void eliminarMascota(ArrayList<Mascotas> lista, String nombreMascota){
        for (Mascotas mascotas : lista) {
            if (mascotas.getNombreDelAnimar().equalsIgnoreCase(nombreMascota)) {
                lista.remove(mascotas);
                lista.remove(nombreMascota);
            }
        }
     }
}
