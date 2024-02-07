package ejercicios;
public class vehiculo {
    private final String matricula;
    enum Color{BLANCO,ROJO,NEGRO,AMARILLO};
    private int numeroRuedas;
    private Color elijeColor;
    public vehiculo(String matricula, int numeroRuedas,Color elijeColor) {
        this.matricula = matricula;
        this.numeroRuedas = numeroRuedas;
        this.elijeColor = elijeColor;
    }

    @Override
    public String toString() {
        return "vehiculo [matricula=" + matricula + ", numeroRuedas=" + numeroRuedas + ", Color=" +elijeColor;
    }
}