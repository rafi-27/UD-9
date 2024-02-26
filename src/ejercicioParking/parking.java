package ejercicioParking;
import java.util.ArrayList;
import java.util.Scanner;

public class parking {
    int plazas = 100;
    static ArrayList<vehicles> listado = new ArrayList<>();

    void entradaVehiculo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tipo de vehiculo1.Vehiculos Generales.2.Vehiculos furgonetas.3.Vehiculos autobuses. ");
        String option = sc.nextLine();

        switch (option) {
            case "1":
                System.out.println("Matricula: ");
                String matricula1 = sc.nextLine();
                System.out.println("Metros: ");
                int metros1 = sc.nextInt();
                listado.add(new vehiculosGenerales(matricula1, metros1));
                break;
            case "2":
                System.out.println("Matricula: ");
                String matricula2 = sc.nextLine();
                System.out.println("Metros: ");
                int metros2 = sc.nextInt();
                listado.add(new vehiculosFurgoneta(matricula2, metros2));
                break;
            case "3":
                System.out.println("Matricula: ");
                String matricula3 = sc.nextLine();
                System.out.println("Metros: ");
                int metros3 = sc.nextInt();
                listado.add(new vehiculosAutobuses(matricula3, metros3));
                break;
            default:
                break;
        }
    }

    void salidaAutos(String matricula, int minutos) {
        for (vehicles vehicle : listado) {
            if (vehicle.matricula.equals(matricula)) {
                if (vehicle instanceof vehicles) {
                    System.out.println("Precio estacionamiento: " + (minutos * 1) + (20 * vehicle.metros));
                    listado.remove(vehicle);
                }
            } else {
                System.out.println("Precio estacionamento: " + (minutos * 1) + (20 * vehicle.metros));
                listado.remove(vehicle);
            }
        }
    }

    void mostrar() {
        for (vehicles vehicle : listado) {
            System.out.println(vehicle.toString());
        }
    }

    void menu() {
        System.out.println("Añadir: 1");
        System.out.println("Salir: 2");
        System.out.println("Mostrar: 3");
        System.out.println("Salir: 4");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elije una opcion: ");
        parking p = new parking();
        boolean seguir = false;
        while (!seguir) {
            p.menu();
            int option = sc.nextInt();
            sc.nextLine(); // Consume la nueva línea
            switch (option) {
                case 1:
                    p.entradaVehiculo();
                    break;
                case 2:
                    System.out.println("Introduce matricula: ");
                    String matricula = sc.nextLine();
                    System.out.println("Introduce minutos: ");
                    int minutos = sc.nextInt();
                    p.salidaAutos(matricula, minutos);
                    break;
                case 3:
                    p.mostrar();
                    break;
                case 4:
                    seguir = true;
                    System.err.println("Ya");
                    break;
                default:
                    break;
            }
        }
    }
}