package ejerciciosUD9.astros;

import java.util.ArrayList;

public class satelites extends EjerAstros {
    //Atributos que tendra la clase de satelites:
    //La distancia que tiene con respecto al planeta que orbita.
    private double distanciaAlPlaneta;
    //El tiempo que tarda el girar sobre ese planeta:
    private double tiempoDeOrbitaAlPlaneta;
    //La guardamos al planeta al que pertenece
    private Object objeto;
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
    public satelites(double masasDelCuerpo, double diametroMedio, double periodoDeRotacion, double periodoTraslacion, double distanciaMediaCuerpo, double distanciaAlPlaneta, double tiempoDeOrbitaAlPlaneta, Object planetaAlQpertenece) {
        super(masasDelCuerpo, diametroMedio, periodoDeRotacion, periodoTraslacion, distanciaMediaCuerpo);
        this.distanciaAlPlaneta = distanciaAlPlaneta;
        this.tiempoDeOrbitaAlPlaneta = tiempoDeOrbitaAlPlaneta;
        this.objeto = objeto;
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

    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }

    /**
     * Metodo para visualizar
     */
    @Override
    public void muestra(ArrayList<EjerAstros> lista) {
        lista.toString();
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
        result = prime * result + ((objeto == null) ? 0 : objeto.hashCode());
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
        if (objeto == null) {
            if (other.objeto != null)
                return false;
        } else if (!objeto.equals(other.objeto))
            return false;
        return true;
    }

}
