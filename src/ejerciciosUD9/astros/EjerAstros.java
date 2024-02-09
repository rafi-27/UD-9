package ejerciciosUD9.astros;

import java.util.ArrayList;

/**
 * La clase Astros va a ser abstracta.
 */
public abstract class EjerAstros {
    //Atributos
    //• Masa del cuerpo.
    private double masasDelCuerpo;
    //• Diámetro medio.
    private double diametroMedio;
    //• Período de rotación sobre su propio eje.
    private double periodoDeRotacion;
    //• Período de traslación alrededor del cuerpo que orbitan.
    private double periodoTraslacion;
    //• Distancia media a ese cuerpo.
    private double distanciaMediaCuerpo;
    
    /**
     * Constructor:
     * @param masasDelCuerpo
     * @param diametroMedio
     * @param periodoDeRotacion
     * @param periodoTraslacion
     * @param distanciaMediaCuerpo
     */
    public EjerAstros(double masasDelCuerpo, double diametroMedio, double periodoDeRotacion, double periodoTraslacion,
            double distanciaMediaCuerpo) {
        this.masasDelCuerpo = masasDelCuerpo;
        this.diametroMedio = diametroMedio;
        this.periodoDeRotacion = periodoDeRotacion;
        this.periodoTraslacion = periodoTraslacion;
        this.distanciaMediaCuerpo = distanciaMediaCuerpo;
    }

    /**Getters y setters */
    public double getMasasDelCuerpo() {
        return masasDelCuerpo;
    }
    public void setMasasDelCuerpo(double masasDelCuerpo) {
        this.masasDelCuerpo = masasDelCuerpo;
    }
    public double getDiametroMedio() {
        return diametroMedio;
    }
    public void setDiametroMedio(double diametroMedio) {
        this.diametroMedio = diametroMedio;
    }
    public double getPeriodoDeRotacion() {
        return periodoDeRotacion;
    }
    public void setPeriodoDeRotacion(double periodoDeRotacion) {
        this.periodoDeRotacion = periodoDeRotacion;
    }
    public double getPeriodoTraslacion() {
        return periodoTraslacion;
    }
    public void setPeriodoTraslacion(double periodoTraslacion) {
        this.periodoTraslacion = periodoTraslacion;
    }
    public double getDistanciaMediaCuerpo() {
        return distanciaMediaCuerpo;
    }
    public void setDistanciaMediaCuerpo(double distanciaMediaCuerpo) {
        this.distanciaMediaCuerpo = distanciaMediaCuerpo;
    }

    /**
     * Metodo mostrar
     *     //Atributos
    //• Masa del cuerpo.
    private double masasDelCuerpo;
    //• Diámetro medio.
    private double diametroMedio;
    //• Período de rotación sobre su propio eje.
    private double periodoDeRotacion;
    //• Período de traslación alrededor del cuerpo que orbitan.
    private double periodoTraslacion;
    //• Distancia media a ese cuerpo.
    private double distanciaMediaCuerpo;
     */

    public abstract void muestra(ArrayList<EjerAstros> lista);

    /**
     * Hashcode
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(masasDelCuerpo);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(diametroMedio);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(periodoDeRotacion);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(periodoTraslacion);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(distanciaMediaCuerpo);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    /**
     * equals
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EjerAstros other = (EjerAstros) obj;
        if (Double.doubleToLongBits(masasDelCuerpo) != Double.doubleToLongBits(other.masasDelCuerpo))
            return false;
        if (Double.doubleToLongBits(diametroMedio) != Double.doubleToLongBits(other.diametroMedio))
            return false;
        if (Double.doubleToLongBits(periodoDeRotacion) != Double.doubleToLongBits(other.periodoDeRotacion))
            return false;
        if (Double.doubleToLongBits(periodoTraslacion) != Double.doubleToLongBits(other.periodoTraslacion))
            return false;
        if (Double.doubleToLongBits(distanciaMediaCuerpo) != Double.doubleToLongBits(other.distanciaMediaCuerpo))
            return false;
        return true;
    }
    

}