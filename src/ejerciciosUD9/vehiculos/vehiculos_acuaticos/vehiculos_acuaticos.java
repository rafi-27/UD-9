package ejerciciosUD9.vehiculos.vehiculos_acuaticos;
import ejerciciosUD9.vehiculos.vehiculos;

public class vehiculos_acuaticos extends vehiculos{
    private final int eslora;

    /**
     * Constructor vehiculos acuaticos:
     * @param matricula
     * @param modelo
     * @param numeroAsientos
     */
    public vehiculos_acuaticos(String matricula, String modelo, int eslora) {
        super(matricula, modelo);
        if (matricula.matches("[a-zA-Z]{3,10}")) {
            this.eslora = eslora;   
        }else{
            this.eslora=0;
            System.err.println("Error Matricula no valida!");
        }
    }
    //Getters numero de asientos
    public int getEslora() {
        return eslora;
    }
    @Override
    public void imprimir() {
        System.out.println("Matricula: "+this.getMatricula());
        System.out.println("Modelo: "+this.getModelo());
        System.out.println("Metros eslora: "+this.getEslora());
    }


  
}
