package ejerciciosUD9.astros;

public class planetas extends EjerAstros {
    //De los planetas tendros los siguentes atributos.
    //Distancia al sol
    private double distanciaAlSol;
    //El tiempo que necesita para dar la vuelta al sol.
    private double tiempoDeOrbitaAlSol;
    //Si tiene satelites
    private boolean tieneSatelites;
    private satelites satelite;
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
        // if (tieneSatelites) {
        //     sateliteQueTiene(new satelites(masasDelCuerpo, diametroMedio, periodoDeRotacion, periodoTraslacion, distanciaMediaCuerpo, distanciaAlSol, tiempoDeOrbitaAlSol, null));
        // }
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

     /**
      * metodo para agrear a un planeta un satelite:
      */
      void sateliteQueTiene(satelites nombreSatelite){
        if (!this.tieneSatelites) {
            System.err.println("No puedes");
        }else{
            this.satelite=nombreSatelite;
        }
      }
    @Override
    public void muestra() {
        System.out.println("Masa del cuerpo: "+this.getMasasDelCuerpo());
        System.out.println("Diametro medio: "+this.getDiametroMedio());
        System.out.println("Periodo de rotacion: "+this.getPeriodoDeRotacion());
        System.out.println("Periodo de traslacion: "+this.getPeriodoTraslacion());
        System.out.println("Distancia media del cuerpo: "+this.getDistanciaMediaCuerpo());
        System.out.println("Distancia al sol: "+this.distanciaAlSol);
        System.out.println("Tiempo de orbita al sol: "+this.tiempoDeOrbitaAlSol);
        System.out.println("Satelite que le pertenece: "+(isTieneSatelites()?this.satelite.toString():"Planeta sin satelite(false)"));
    }
}
