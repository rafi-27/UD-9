package ejerciciosUD9.vehiculos.vehiculos_aereos;

import ejerciciosUD9.vehiculos.vehiculos;

public class vehiculos_aereos extends vehiculos{
    private final int numeroAsientos;

    /**
     * Constructor:
     * @param matricula
     * @param modelo
     * @param numeroAsientos
     */
    public vehiculos_aereos(String matricula, String modelo, int numeroAsientos) {
        super(matricula, modelo);
        if (matricula.matches("[a-zA-Z]{4}[0-9]{6}")) {
            this.numeroAsientos = numeroAsientos;   
        }else{
            this.numeroAsientos=0;
            System.err.println("Error Matricula no valida!");
        }
    }

    //Generamos el getter:
    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    @Override
    public void imprimir() {
        System.out.println("Matricula: "+this.getMatricula());
        System.out.println("Modelo: "+this.getModelo());
        System.out.println("Asientos: "+this.numeroAsientos);
    }
}
