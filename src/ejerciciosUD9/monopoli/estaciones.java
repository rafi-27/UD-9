package ejerciciosUD9.monopoli;

public class estaciones extends propiedad{
    private static int VALOR_ESTACION=20000;
    /**
     * Clase Estacion (hija de Propiedad):
     * Constante: VALOR_ESTACION (int)
     * Métodos: constructor, método para calcular el precio del alquiler
     */
     public estaciones(String nombreCasilla) {
        super(nombreCasilla, VALOR_ESTACION, VALOR_ESTACION);
    }
    @Override
    public double getAlquiler(int modificacion) {
        if (modificacion<=0) {
            return 0;
        }else{
            return this.precio/modificacion;
        }
    }

    
}