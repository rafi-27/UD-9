package ejerciciosUD9.vehiculos.vehiculos_terrestres;

import ejerciciosUD9.mascotas.aves.Canario.colores;

public class moto extends vehiculos_terrestres{
    protected enum Colores{ROJO,NEGRO,AMARILLO,BLANCO}
    private colores color;
    
    /**
     * Constructor de moto:
     * @param matricula
     * @param modelo
     * @param numeroRuedas
     * @param color
     */
    public moto(String matricula, String modelo, int numeroRuedas, colores color) {
        super(matricula, modelo, numeroRuedas);
        this.color = color;
    }

    //Getters y setters:
    public colores getColor() {
        return color;
    }
    public void setColor(colores color) {
        this.color = color;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("La moto es de color "+this.color);
    }
}
