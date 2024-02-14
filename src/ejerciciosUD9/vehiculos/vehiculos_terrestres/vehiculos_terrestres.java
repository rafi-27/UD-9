package ejerciciosUD9.vehiculos.vehiculos_terrestres;

import ejerciciosUD9.vehiculos.vehiculos;

public class vehiculos_terrestres extends vehiculos {
    private final int numeroRuedas;

    /**
     * Constructor para los vehiculos terrestres:
     * @param matricula
     * @param modelo
     * @param numeroRuedas
     */
    public vehiculos_terrestres(String matricula, String modelo, int numeroRuedas) {
        super(matricula, modelo);
        
        if (matricula.matches("[0-9]{4}[a-zA-Z]{3}")) {
            this.numeroRuedas = numeroRuedas;    
        }else{
            this.numeroRuedas=0;
            System.err.println("Error Matricula no valida!");
        }
    }
    /**
     * Un getter
     * @return
     */
    public int getNumeroRuedas() {
        return numeroRuedas;
    }
    @Override
    public void imprimir() {
        System.out.println("Matricula: "+this.getMatricula());
        System.out.println("Modelo: "+this.getModelo());
        System.out.println("Numero de ruedas: "+this.getNumeroRuedas());
    }

    

}
