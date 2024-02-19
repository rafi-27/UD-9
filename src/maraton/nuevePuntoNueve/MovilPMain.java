package maraton.nuevePuntoNueve;

import java.util.ArrayList;

public class MovilPMain {
    public static void main(String[] args) {
        MovilPrepagoClass telef1 = new MovilPrepagoClass(54587645, 0.05f, 0.02f, 0.25f, 5);
        MovilPlus telef2 = new MovilPlus(777777777, 0.05f, 0.02f, 0.25f, 10);
        MovilTarifaPlana telef3 = new MovilTarifaPlana(6364621, 0.05f, 0.02f, 50);

        ArrayList<MovilPrepagoClass>listaTelefonos = new ArrayList<>();

        listaTelefonos.add(telef1);
        listaTelefonos.add(telef2);
        listaTelefonos.add(telef3);

        System.out.println(telef1.toString());
        telef2.consultarDatosTelefono();
        telef3.consultarDatosTelefono();

        // for (MovilPrepagoClass movilPrepago : listaTelefonos) {
        //     System.out.println(movilPrepago);
        // }
    }
}