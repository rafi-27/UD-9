package ejerciciosUD9.monopoli;
import java.util.ArrayList;

public class tablero {
    private ArrayList<casilla>listaCasillasTodoTipos = new ArrayList<>();

    /**
     * Se crea un tablera agregado sus objetos a nuestra lista:
     */
    public tablero(){
        terreno primerTerreno = new terreno("primerTerrenoVerde", 1500000, 200000, 8500, terreno.ColorTerreno.VERDE);
        terreno segundoTerreno = new terreno("segundoTerrenoVerde", 300000, 250000, 10500, terreno.ColorTerreno.VERDE);
        estaciones primeraEstacion = new estaciones("Norte");
        terreno tercerTerreno = new terreno("tercerTerrenoRojo", 1400000, 300000, 5500, terreno.ColorTerreno.ROJO);
        estaciones segundaEstacion = new estaciones("Sur");
        listaCasillasTodoTipos.add(primerTerreno);
        listaCasillasTodoTipos.add(segundoTerreno);
        listaCasillasTodoTipos.add(primeraEstacion);
        listaCasillasTodoTipos.add(tercerTerreno);
        listaCasillasTodoTipos.add(segundaEstacion);
    }

    //Mostrar el tablero:
    void mostrarTablero(){
        for (casilla casilla : listaCasillasTodoTipos) {
            if (casilla instanceof casilla) {
                System.out.println(casilla.getNombreCasilla()+" "+casilla.getCodigo());    
            }else if (casilla instanceof estaciones) {
                estaciones temporal = (estaciones)casilla;
                System.out.println(temporal.getNombreCasilla()+" "+temporal.getPropietario()+" "+temporal.getPrecio());
            }else if (casilla instanceof terreno) {
                terreno temporal = (terreno)casilla;
                System.out.println(temporal.getNombreCasilla()+" "+temporal.getPropietario()+" "+temporal.getPrecio()+" "+temporal.getColorElejido());
            }else if (casilla instanceof propiedad) {
                propiedad temporal = (propiedad)casilla;
                System.out.println(temporal.getNombreCasilla()+" "+temporal.getPropietario()+" "+temporal.getPrecio()+" "+temporal.getCodigo());
            }
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