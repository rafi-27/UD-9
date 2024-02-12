package ejerciciosUD9.mascotas;

import java.util.ArrayList;
import java.util.Scanner;

import ejerciciosUD9.mascotas.aves.Canario;
import ejerciciosUD9.mascotas.aves.Loro;

public class Inventario {
    public static void main(String[] args) {
        
    }    


    /**
     * Tendremos un switch aqui:
     */

     public void miniMenu(){
        ArrayList<Mascotas> listaDeMascotas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Mostrar lista animales(tipo y nombre)\n2.Mostrar datos de un animal en concreto\n"+
        "3.Mostrar todos los datos de todos los animales.\n4.Insertar animales al inventario\n5.Eliminar animales del inventario\n"+
        "6.Vaciar el inventario");

        String opcion = sc.next();

        while (!opcion.matches("[123456]+")) {
            System.err.println("Error vuelva a introducir el numero: ");
            opcion = sc.next();
        }
        int selecionado = Integer.parseInt(opcion);
        boolean salir=false;
        while (!salir) {
            switch (selecionado) {
                case 1:
                    mostrarAnimalPorTipoYnombre(listaDeMascotas);   
                    break;
                case 2:
                    String nombreAnimal=sc.nextLine();
                    mostrarAnimalEnConcreto(listaDeMascotas, nombreAnimal);     
                    break;
                case 3:
                    mostrarTodoLosDatos(listaDeMascotas);
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                System.out.println("Adeu");
                    salir = true;
                    break;
            }
            sc.close();
        }
     }

     /**
      * Metodos
      * @param lista
      */
     void mostrarAnimalPorTipoYnombre(ArrayList<Mascotas> lista){
        for (Mascotas mascota : lista) {
            System.out.println(mascota.getClass()+" "+mascota.nombreDelAnimar);
        }
     }

     void mostrarAnimalEnConcreto(ArrayList<Mascotas> lista, String name){
        for (int i = 0; i < lista.size(); i++) {
            for (Mascotas mascota : lista) {
                if (lista.get(i).nombreDelAnimar==name) {
                    mascota.muestra();
                }
            }
        }
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
        switch (tipoAnimal) {
            case 1:
                System.out.println("Nombre: ");
                String name = teclado.nextLine();
                System.out.println("Estado: ");
                String estado = teclado.nextLine();
                System.out.println("Edad: ");
                int edad = teclado.nextInt();
                System.out.println("Fecha fallecimiento: ");
                String fecha = teclado.nextLine();
                System.out.println("Raza: ");
                String raza = teclado.nextLine();
                System.out.println("Tiene pulgas?: ");
                boolean tienePulgasOno = teclado.nextBoolean();
                lista.add(new Perro(name, edad, estado, fecha, raza, tienePulgasOno));
                break;
            case 2:
            System.out.println("Nombre: ");
            name = teclado.nextLine();
            System.out.println("Estado: ");
            estado = teclado.nextLine();
            System.out.println("Edad: ");
            edad = teclado.nextInt();
            System.out.println("Fecha fallecimiento: ");
            fecha = teclado.nextLine();
            System.out.println("Raza: ");
            raza = teclado.nextLine();
            System.out.println("Tiene pelo largo?: ");
            boolean tienePeloLargo = teclado.nextBoolean();
            System.out.println("Color: ");
            lista.add(new Gato(name, edad, estado, fecha, tienePeloLargo, null));
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
                edad = teclado.nextInt();
                System.out.println("Fecha fallecimiento: ");
                fecha = teclado.nextLine();
                System.out.println("Origen: ");
                String origen = teclado.nextLine();
                System.out.println("Pico: ");
                String tipoPico = teclado.nextLine();
                System.out.println("Vuela?: ");
                boolean volar = teclado.nextBoolean();
                System.out.println("Habla: ");
                String habla = teclado.nextLine();
                lista.add(new Loro(name, edad, estado, fecha,tipoPico,volar, origen, habla));
                    break;
                case 2:
                // System.out.println("Nombre: ");
                // name = teclado.nextLine();
                // System.out.println("Estado: ");
                // estado = teclado.nextLine();
                // System.out.println("Edad: ");
                // edad = teclado.nextInt();
                // System.out.println("Fecha fallecimiento: ");
                // fecha = teclado.nextLine();
                // System.out.println("Origen: ");
                // String origen = teclado.nextLine();
                // System.out.println("Pico: ");
                // String tipoPico = teclado.nextLine();
                // System.out.println("Vuela?: ");
                // boolean volar = teclado.nextBoolean();
                // System.out.println("Habla: ");
                // String habla = teclado.nextLine();
                // lista.add(new Canario(name, edad, estado, fecha,tipoPico,volar, origen, habla));
                    break;
                default:
                System.err.println("Opcion invalida.");
                    break;
            }
                break;
            default:
                System.err.println("Opcion incorrecta.");
            break;
        }
     }






}
