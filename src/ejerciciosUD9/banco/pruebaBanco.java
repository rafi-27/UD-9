package ejerciciosUD9.banco;

public class pruebaBanco {
    public static void main(String[] args) {
        CuentaCorriente primeraCuenta = new CuentaCorriente("ES029348587", 4500);
        CuentaAhorros segundaCuenta = new CuentaAhorros("ES029348587", 1500);

        primeraCuenta.mostrarDatos();
        segundaCuenta.mostrarDatos();
        //-----------------------------
        primeraCuenta.ingresar(5000);
        segundaCuenta.retirar(500);
       //------------------------------
        System.out.println("Pruebas");
        primeraCuenta.mostrarDatos();
        segundaCuenta.mostrarDatos();
        //------------------------------
        System.out.println("Calculamos Intereses: ");
        primeraCuenta.calcularIntereses();
        segundaCuenta.calcularIntereses();
        //------------------------------
        primeraCuenta.mostrarDatos();
        segundaCuenta.mostrarDatos();






    }
}
