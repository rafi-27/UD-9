package ejerciciosUD9.monopoli;
import java.util.ArrayList;

public class tablero {
    private ArrayList<casilla>listaCasillasTodoTipos = new ArrayList<>();

    /**
     * Se crea un tablera agregado sus objetos a nuestra lista:
     */
    public tablero(){
        listaCasillasTodoTipos.add(new terreno("primerTerrenoVerde", 1500000, 200000, 8500, terreno.ColorTerreno.VERDE));
        listaCasillasTodoTipos.add(new terreno("segundoTerrenoVerde", 300000, 250000, 10500, terreno.ColorTerreno.VERDE));
        listaCasillasTodoTipos.add(new estaciones("Norte"));
        listaCasillasTodoTipos.add(new terreno("tercerTerrenoRojo", 1400000, 300000, 5500, terreno.ColorTerreno.ROJO));
        listaCasillasTodoTipos.add(new estaciones("Sur"));
    }

    //Mostrar el tablero:
    void mostrarTablero(){
        for (casilla casilla : listaCasillasTodoTipos) {
            System.out.println(casilla.toString());
        }
    }

    //Funcion para seleccionar los terrenos de un jugador en concreto:
    ArrayList<terreno> listaTerrenos(int jugador){
        ArrayList<terreno>listaAdevolver = new ArrayList<>();
        for (casilla casilla : listaCasillasTodoTipos) {
            if (casilla instanceof terreno) {
                terreno tempo = (terreno) casilla;
                listaAdevolver.add(tempo);
            }
        }
        return listaAdevolver;
    }
}