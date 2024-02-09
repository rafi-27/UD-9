package ejerciciosUD9.astros;

import java.util.ArrayList;

public class planetas extends EjerAstros {
    //De los planetas tendros los siguentes atributos.
    //Distancia al sol
    private double distanciaAlSol;
    //El tiempo que necesita para dar la vuelta al sol.
    private double tiempoDeOrbitaAlSol;
    //Si tiene satelites
    private boolean tieneSatelites;
    
    /**
     * Constructor de planetas:
     * @param masasDelCuerpo
     * @param diametroMedio
     * @param periodoDeRotacion
     * @param periodoTraslacion
     * @param distanciaMediaCuerpo
     * @param distanciaAlSol
     * @param tiempoDeOrbitaAlSol
     * @param tieneSatelites
     */
    public planetas(double masasDelCuerpo, double diametroMedio, double periodoDeRotacion, double periodoTraslacion, double distanciaMediaCuerpo, double distanciaAlSol, double tiempoDeOrbitaAlSol, boolean tieneSatelites) {
        super(masasDelCuerpo, diametroMedio, periodoDeRotacion, periodoTraslacion, distanciaMediaCuerpo);
        this.distanciaAlSol = distanciaAlSol;
        this.tiempoDeOrbitaAlSol = tiempoDeOrbitaAlSol;
        this.tieneSatelites = tieneSatelites;
    }

    //Getters y setters
    public double getDistanciaAlSol() {
        return distanciaAlSol;
    }

    public void setDistanciaAlSol(double distanciaAlSol) {
        this.distanciaAlSol = distanciaAlSol;
    }

    public double getTiempoDeOrbitaAlSol() {
        return tiempoDeOrbitaAlSol;
    }

    public void setTiempoDeOrbitaAlSol(double tiempoDeOrbitaAlSol) {
        this.tiempoDeOrbitaAlSol = tiempoDeOrbitaAlSol;
    }

    public boolean isTieneSatelites() {
        return tieneSatelites;
    }

    public void setTieneSatelites(boolean tieneSatelites) {
        this.tieneSatelites = tieneSatelites;
    }

    @Override
    public void muestra(ArrayList<EjerAstros> lista) {
        lista.toString();
    }
}
