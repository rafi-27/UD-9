package maraton.nuevePuntoNueve;

public class MovilPlus extends MovilPrepagoClass implements PrePagable{

    public MovilPlus(int number, float costcall, float costminutcall, float costconsumMB, float cash) {
        super(number, costcall, costminutcall, costconsumMB, cash);
    }

    /**
     * Metodo llamar en MovilPlus que no tiene en cuenta el coste de la llamada::
     */
    @Override
    public void efectuarLlamada(int segundos) {
        float costoLlamada = (costeMinutoLlamada * segundos) / 60;
        if (saldo > 0) {
            saldo -= costoLlamada;
        } else {
            System.err.println("No tienes suficiente saldo!");
        }
    }

    /**
     * funcionalidad llamada videollamada a la que se le pasa los segundos de
     * la videollamada y reduce el saldo de forma similar a ‘navegar’.
     * En este caso, cada segundo de llamada son 2 MB de datos (recuerda que los
     * atributos de MovilPrepago son privados, esto puede ser un problema a
     * resolver).
     * 
     * @param segundos
     */
    void videollamada(double segundos) {
        // 2 MB por segundo de videollamada
        double megabytesConsumidos = segundos * 2;
        double costoVideollamada = this.costeConsumoMB * megabytesConsumidos;
        if (this.saldo>=costoVideollamada) {
            this.saldo-=costoVideollamada;
        }else{
            System.err.println("No te queda suficiente saldo.");
        }
    }

    @Override
    public String toString() {
        return "MovilPlus numero "+this.numeroMovil+" saldo: "+this.saldo;
    }
    @Override
    public void consultarDatosTelefono() {
        System.out.println("Numero: "+this.numeroMovil);
        System.out.println("Con saldo de: "+((this.saldo>0)?this.saldo:"No queda saldo."));
    }
}
