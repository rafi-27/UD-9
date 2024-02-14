package ejerciciosUD9.vehiculos.vehiculos_acuaticos;

public class submarino extends vehiculos_acuaticos{
    private double profundidadMaxima;
    
    /**
     *Constructor para submarino 
     * @param matricula
     * @param modelo
     * @param eslora
     */
    public submarino(String matricula, String modelo, int eslora,double profundidad) {
        super(matricula, modelo, eslora);
        this.profundidadMaxima=profundidad;
    } 

    //Getters y Setters
    public double getProfundidadMaxima() {
        return profundidadMaxima;
    }
    public void setProfundidadMaxima(double profundidadMaxima) {
        this.profundidadMaxima = profundidadMaxima;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Tiene un maximo de profundidad de "+this.profundidadMaxima);
    }
}
