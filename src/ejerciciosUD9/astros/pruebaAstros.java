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
        EjerAstros planetaTierra = new planetas(548, 122354, 63, 89, 145, 178, 24, false);
        EjerAstros planetaMarte = new planetas(548, 122354, 63, 89, 145, 178, 24, true);

        //Creamos dos satelites:
        EjerAstros primerSatelite = new satelites(12, 87, 45, 5, 6, 9, 10, planetaMarte);
        EjerAstros segundoSatelite = new satelites(12, 87, 45, 5, 6, 9, 10, planetaMarte);
        
        listaDeLosAstros.add(planetaMarte);
        listaDeLosAstros.add(planetaTierra);
        listaDeLosAstros.add(primerSatelite);
        listaDeLosAstros.add(segundoSatelite);

        planetaMarte.muestra(listaDeLosAstros);
        //primerSatelite.muestra(listaDeLosAstros);
    }
}
