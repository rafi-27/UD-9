package ejercicios;
public class coche extends vehiculo{
    private double pesoKg;
    private final static int ruedas = 4;
    
    public coche(String matricula, Color elijeColor, double pesoKg) {
        super(matricula, ruedas, elijeColor);
        this.pesoKg = pesoKg;
    }

    @Override
    public String toString() {
        return super.toString()+" coche pesoKg=" + pesoKg + "kg]";
    }
}
