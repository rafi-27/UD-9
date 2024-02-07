package ejercicios;
public class moto extends vehiculo{
    private boolean carenada;

    public moto(String matricula, int numeroRuedas, vehiculo.Color elijeColor, boolean carenada) {
        super(matricula, numeroRuedas, elijeColor);
        this.carenada = carenada;
    }

    @Override
    public String toString() {
        return super.toString()+" moto carenada=" + carenada + "]";
    }
    
    
}
