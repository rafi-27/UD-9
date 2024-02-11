package ejerciciosUD9.astros;

import java.util.ArrayList;

public class pruebaAstros {
    /**
     * Aqui vamos a realizar las pruebas.
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<EjerAstros> listaDeLosAstros = new ArrayList<>();

        //Vamos a crear dos planetas:
        planetas planetaTierra = new planetas(548, 122354, 63, 89, 145, 178, 24, true);
        planetas planetaMarte = new planetas(548, 122354, 63, 89, 145, 178, 24, false);

        //Creamos dos satelites:
        satelites primerSatelite = new satelites(12, 87, 45, 5, 6, 9, 10,planetaTierra);
        satelites segundoSatelite = new satelites(12, 87, 45, 5, 6, 9, 10, planetaMarte);
        

        listaDeLosAstros.add(planetaMarte);
        listaDeLosAstros.add(planetaTierra);
        listaDeLosAstros.add(primerSatelite);
        listaDeLosAstros.add(segundoSatelite);
        planetaTierra.sateliteQueTiene(segundoSatelite);
        planetaMarte.sateliteQueTiene(primerSatelite);
        for (EjerAstros Astros : listaDeLosAstros) {
            if (Astros instanceof satelites) {
                System.out.println("satelite: ");
                Astros.muestra();
            }else if (Astros instanceof planetas) {
                System.out.println("planetas: ");
                Astros.muestra();
            }
            System.out.println("Siguente: ");
        }
    }
}