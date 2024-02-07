package ejercicios;
import java.util.ArrayList;

public class pruebas {
    public static void main(String[] args) {    
    coche cocheUno = new coche("EOI232", vehiculo.Color.NEGRO,120);
    moto motouno = new moto("Kawasaki", 2, vehiculo.Color.BLANCO, false);
    coche porshe = new coche("TH3940", vehiculo.Color.ROJO, 750);
    vehiculo vehicle = new vehiculo("Si", 15, vehiculo.Color.AMARILLO);

    ArrayList<vehiculo> listaVehiculos = new ArrayList<>();
    listaVehiculos.add(cocheUno);
    listaVehiculos.add(motouno);
    listaVehiculos.add(porshe);
    listaVehiculos.add(vehicle);

    System.out.println(cocheUno);
    System.out.println(motouno);
    System.out.println();
    System.out.println(porshe);
    System.out.println();
    System.out.println(vehicle);
    //?"Si":"No"
    int cont=0;
    int contMoto=0;
    int contV=0;
    for (vehiculo v : listaVehiculos) {
        if (v instanceof coche) {
            cont++;
        }else if (v instanceof moto) {
            contMoto++;
        } else if (v instanceof vehiculo) {
            contV++;
        }
    }
    System.out.println("Coches: "+cont);
    System.out.println("Motos: "+contMoto);
    System.out.println("Vehiculos "+contV);

}
}