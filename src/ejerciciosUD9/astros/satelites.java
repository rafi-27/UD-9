package ejerciciosUD9.astros;

public class satelites extends EjerAstros {
    //Atributos que tendra la clase de satelites:
    //La distancia que tiene con respecto al planeta que orbita.
    private double distanciaAlPlaneta;
    //El tiempo que tarda el girar sobre ese planeta:
    private double tiempoDeOrbitaAlPlaneta;
    //La guardamos al planeta al que pertenece
    private planetas planeta;
    /**
     * @param masasDelCuerpo
     * @param diametroMedio
     * @param periodoDeRotacion
     * @param periodoTraslacion
     * @param distanciaMediaCuerpo
     * @param distanciaAlPlaneta
     * @param tiempoDeOrbitaAlPlaneta
     * @param objeto
     */
    public satelites(double masasDelCuerpo, double diametroMedio, double periodoDeRotacion, double periodoTraslacion, double distanciaMediaCuerpo, double distanciaAlPlaneta, double tiempoDeOrbitaAlPlaneta, planetas planetaAlQpertenece) {
        super(masasDelCuerpo, diametroMedio, periodoDeRotacion, periodoTraslacion, distanciaMediaCuerpo);
        this.distanciaAlPlaneta = distanciaAlPlaneta;
        this.tiempoDeOrbitaAlPlaneta = tiempoDeOrbitaAlPlaneta;
        this.planeta = planetaAlQpertenece;
    }

    /**
     * Setters y getters simples.
     * @return
     */
    public double getDistanciaAlPlaneta() {
        return distanciaAlPlaneta;
    }

    public void setDistanciaAlPlaneta(double distanciaAlPlaneta) {
        this.distanciaAlPlaneta = distanciaAlPlaneta;
    }

    public double getTiempoDeOrbitaAlPlaneta() {
        return tiempoDeOrbitaAlPlaneta;
    }

    public void setTiempoDeOrbitaAlPlaneta(double tiempoDeOrbitaAlPlaneta) {
        this.tiempoDeOrbitaAlPlaneta = tiempoDeOrbitaAlPlaneta;
    }

    public planetas getplaneta() {
        return planeta;
    }

    public void setplaneta(planetas planeta) {
        this.planeta = planeta;
    }

    /**
     * Metodo para visualizar
     * @param masasDelCuerpo
     * @param diametroMedio
     * @param periodoDeRotacion
     * @param periodoTraslacion
     * @param distanciaMediaCuerpo
     * @param distanciaAlPlaneta
     * @param tiempoDeOrbitaAlPlaneta
     * @param objeto
     */
    @Override
    public void muestra() {
        System.out.println("Masa del cuerpo: "+this.getMasasDelCuerpo());
        System.out.println("Diametro medio: "+this.getDiametroMedio());
        System.out.println("Periodo de rotacion: "+this.getPeriodoDeRotacion());
        System.out.println("Periodo de traslacion: "+this.getPeriodoTraslacion());
        System.out.println("Distancia media del cuerpo: "+this.getDistanciaMediaCuerpo());
        System.out.println("Distancia al planeta que pertenece: "+this.distanciaAlPlaneta);
        System.out.println("Tiempo de orbita al planeta: "+this.tiempoDeOrbitaAlPlaneta);
        System.out.println("Planeta al que pertenece: "+getplaneta().toString());
    }
    
    /**
    * Hash y equals
    */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(distanciaAlPlaneta);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(tiempoDeOrbitaAlPlaneta);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((planeta == null) ? 0 : planeta.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        satelites other = (satelites) obj;
        if (Double.doubleToLongBits(distanciaAlPlaneta) != Double.doubleToLongBits(other.distanciaAlPlaneta))
            return false;
        if (Double.doubleToLongBits(tiempoDeOrbitaAlPlaneta) != Double.doubleToLongBits(other.tiempoDeOrbitaAlPlaneta))
            return false;
        if (planeta == null) {
            if (planeta != null)
                return false;
        } else if (!planeta.equals(other.planeta))
            return false;
        return true;
    }

}
