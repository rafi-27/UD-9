package ejerciciosUD9.vehiculos;

import java.util.ArrayList;

import ejerciciosUD9.mascotas.aves.Canario.colores;
import ejerciciosUD9.vehiculos.vehiculos_acuaticos.barcos;
import ejerciciosUD9.vehiculos.vehiculos_acuaticos.submarino;
import ejerciciosUD9.vehiculos.vehiculos_acuaticos.vehiculos_acuaticos;
import ejerciciosUD9.vehiculos.vehiculos_aereos.avion;
import ejerciciosUD9.vehiculos.vehiculos_aereos.helicoptero;
import ejerciciosUD9.vehiculos.vehiculos_aereos.vehiculos_aereos;
import ejerciciosUD9.vehiculos.vehiculos_terrestres.coche;
import ejerciciosUD9.vehiculos.vehiculos_terrestres.moto;
import ejerciciosUD9.vehiculos.vehiculos_terrestres.vehiculos_terrestres;

public class programaVehiculos {
    public static void main(String[] args) {
        /**
         * Aqui vamos a realizar nuestras pruebas de vehiculos.
         * Creamos un vehiculo de cada:
         */

         ArrayList<vehiculos>listaVehiculos = new ArrayList<>();
        //Vehiculos terrestres
        vehiculos_terrestres coche = new coche("4578kik", "Ferrari", 4, false);
        vehiculos_terrestres moto = new moto("2341iio", "BMW", 8, colores.VERDE);
        //Vehiculos acuaticos
        vehiculos_acuaticos barco = new barcos("dfggf","Lambo", 5, false);
        vehiculos_acuaticos submarino = new submarino("tewtdsgf", "Bote LUJO", 90, 1500);
        //Vehiculos aereos
        vehiculos_aereos avion = new avion("rafe785458", "BOING 777", 58, 3.52);
        vehiculos_aereos helicopter = new helicoptero("tett778546","Otro BOING", 7, 15);

        listaVehiculos.add(coche);
        listaVehiculos.add(moto);
        listaVehiculos.add(barco);
        listaVehiculos.add(submarino);
        listaVehiculos.add(avion);
        listaVehiculos.add(helicopter);
        //Probamos mostrar los datos deben ser erroneos por la matricula:
        
        for (vehiculos vehiculos : listaVehiculos) {
            if (vehiculos instanceof vehiculos_terrestres) {
                System.out.println("Vehiculo terrestre: ");
                vehiculos.imprimir();
            }else if (vehiculos instanceof vehiculos_acuaticos) {
                System.out.println("Vehiculo acuaticos: ");
                vehiculos.imprimir();
            }else if (vehiculos instanceof vehiculos_aereos) {
                System.out.println("Vehiculo acuaticos: ");
                vehiculos.imprimir();
            }
            System.out.println();
        }
    }
}
