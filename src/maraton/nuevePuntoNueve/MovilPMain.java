package maraton.nuevePuntoNueve;

public class MovilPMain {
    public static void main(String[] args) {
        MovilPrepagoClass telefonoVodafone = new MovilPrepagoClass(63245875,0.50f,0.25f,0.02f,10);
        System.out.println(telefonoVodafone.consultarSaldo());

        telefonoVodafone.efectuarLlamada(70);
        System.out.println(telefonoVodafone.consultarSaldo());

        //telefonoVodafone.navegar(250);
        //System.out.println(telefonoVodafone.consultarSaldo());

        //telefonoVodafone.recargar(10);
        //System.out.println(telefonoVodafone.consultarSaldo());
    }
}