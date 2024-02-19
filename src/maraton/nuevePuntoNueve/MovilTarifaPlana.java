package maraton.nuevePuntoNueve;

public class MovilTarifaPlana extends MovilPrepagoClass implements PrePagable{
    /**
     * Añade una nueva subclase de MovilPrepago llamada MovilTarifaPlana¸ 
     * en la que se redefine el método navegar para no reducir el saldo y 
     * además en el constructor fija el coste de navegación a cero.
     */
    public MovilTarifaPlana(int number, float costcall, float costminutcall, float cash) {
        super(number, costcall, costminutcall, 0, cash);
    }

    /**
     * Modificamos para que no tenga consumo de mb:
     * @param number
     * @param costcall
     * @param costminutcall
     * @param costconsumMB
     * @param cash
     */
    @Override
    public void navegar(int MB) {
        //float costoNavegacion = this.costeConsumoMB*MB;
        if(this.saldo > 0){
            System.err.println("Hecho");
        }else {
            System.err.println("No tienes suficiente saldo!");
        }
    }
    @Override
    public void consultarDatosTelefono() {
       System.out.println("Numero Movil tarifa plana: "+this.numeroMovil);
       System.out.println("Saldo: "+((this.saldo>0)?this.saldo:"No le queda saldo."));
    }
}