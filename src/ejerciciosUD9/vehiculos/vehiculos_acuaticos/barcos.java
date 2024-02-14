package ejerciciosUD9.vehiculos.vehiculos_acuaticos;

public class barcos extends vehiculos_acuaticos{
    private boolean tieneMotor;
    
    /**
     * Constructor
     * @param matricula
     * @param modelo
     * @param eslora
     */
    public barcos(String matricula, String modelo, int eslora, boolean motor) {
        super(matricula, modelo, eslora);
        this.tieneMotor=motor;
    }
    
    //Getters y Setters
    public boolean isTieneMotor() {
        return tieneMotor;
    }
    public void setTieneMotor(boolean tieneMotor) {
        this.tieneMotor = tieneMotor;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        if (this.tieneMotor) {
            System.out.println("Tiene motor.");
        }else{
            System.out.println("No tiene motor.");
        }
    }
}
