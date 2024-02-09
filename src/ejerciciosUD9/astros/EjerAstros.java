package ejerciciosUD9.astros;
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
     * TooString
     */
     @Override
    public String toString() {
        return "EjerAstros [masasDelCuerpo=" + masasDelCuerpo + ", diametroMedio=" + diametroMedio
                + ", periodoDeRotacion=" + periodoDeRotacion + ", periodoTraslacion=" + periodoTraslacion
                + ", distanciaMediaCuerpo=" + distanciaMediaCuerpo;
    }

}