package ejerciciosUD9.astros;

import java.util.ArrayList;
import java.util.Scanner;

public class pruebaAstros {
    /**
     * Aqui vamos a realizar las pruebas.
     * 
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<EjerAstros> listaDeLosAstros = new ArrayList<>();

        // Vamos a crear dos planetas:
        planetas planetaTierra = new planetas(548, 122354, 63, 89, 145, 178, 24, true);
        planetas planetaMarte = new planetas(548, 122354, 63, 89, 145, 178, 24, true);

        // Creamos dos satelites:
        satelites primerSatelite = new satelites(12, 87, 45, 5, 6, 9, 10, planetaTierra);
        satelites segundoSatelite = new satelites(12, 87, 45, 5, 6, 9, 10, planetaMarte);

        listaDeLosAstros.add(planetaMarte);
        listaDeLosAstros.add(planetaTierra);
        listaDeLosAstros.add(primerSatelite);
        listaDeLosAstros.add(segundoSatelite);

        planetaTierra.sateliteQueTiene(segundoSatelite);
        planetaMarte.sateliteQueTiene(primerSatelite);

        miniMenu(listaDeLosAstros);        

        // for (EjerAstros Astros : listaDeLosAstros) {
        //     if (Astros instanceof satelites) {
        //         System.out.println("satelite: ");
        //         Astros.muestra();
        //     } else if (Astros instanceof planetas) {
        //         System.out.println("planetas: ");
        //         Astros.muestra();
        //     }
        //     System.out.println();
        //     System.out.println();
        // }
    }







    public static void miniMenu(ArrayList<EjerAstros> listaAstros) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        while (!salir) {
            int opcion;
            System.out.println("Que tareas quieres realizar: \n1.Mostrar planetas\n2.Mostrar satelites\n3.Ambas\n5.Salir");
            opcion = sc.nextInt();
            while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 5) {
                System.err.println("Error vuelva a introducir una opcion correcta.");
                opcion = sc.nextInt();
            }
            switch (opcion) {
                case 1:
                    for (EjerAstros element : listaAstros) {
                        if (element instanceof planetas) {
                            element.muestra();
                        }
                    }
                    break;
                case 2:
                    for (EjerAstros element : listaAstros) {
                        if (element instanceof satelites) {
                            element.muestra();
                        }
                    }
                    break;
                case 3:
                    for (EjerAstros element : listaAstros) {
                        element.muestra();
                    }
                    break;
                case 5:
                    System.err.println("Hasta otra!!");
                    break;
            }
        }
        sc.close();
    }
}