

public class pruebas {
    public static void main(String[] args) {    
    coche cocheUno = new coche("EOI232", vehiculo.Color.NEGRO,120);
    moto motouno = new moto("Kawasaki", 2, vehiculo.Color.BLANCO, false);
    coche porshe = new coche("TH3940", vehiculo.Color.ROJO, 750);
    vehiculo vehicle = new vehiculo("Si", 15, vehiculo.Color.AMARILLO);

    System.out.println(cocheUno);
    System.out.println(motouno);
    System.out.println();
    System.out.println(porshe);
    
    System.out.println();
    System.out.println(vehicle);

}
}