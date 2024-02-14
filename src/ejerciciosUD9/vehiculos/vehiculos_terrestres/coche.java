package ejerciciosUD9.vehiculos.vehiculos_terrestres;

public class coche extends vehiculos_terrestres{
    private boolean aireAcondicionado;

    /**
     * Constructor coches
     * @param matricula
     * @param modelo
     * @param numeroRuedas
     * @param aireAcondicionado
     */
    public coche(String matricula, String modelo, int numeroRuedas, boolean aireAcondicionado) {
        super(matricula, modelo, numeroRuedas);
        this.aireAcondicionado = aireAcondicionado;
    }

    //Setters y getters
    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }
    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        if (aireAcondicionado) {
            System.out.println("Este coche tiene aire acondicionado.");
        }else{
            System.out.println("Este coche no tiene aire acondicionado");
        }
    }
}
