package ejerciciosUD9.banco;

public class CuentaAhorros extends CuentaBancaria {
    private static final double saldoMinimo = 500;

    /**
     * La segunda tendrá una constante de clase llamada saldoMinimo. Si no se llega
     * a
     * este saldo el interés será la mitad del interés básico. Si se supera el saldo
     * mínimo
     * el interés aplicado será el doble del interés anual básico.
     */

    public CuentaAhorros(String numeroCuenta, double saldo) {
        super(numeroCuenta, saldo);

    }

    @Override
    public void calcularIntereses() {
        double interesAsumar;
        if (saldoMinimo < getSaldo()) {
            interesAsumar = (getSaldo()*interesAnualBasico*0.5);
        }else{
            interesAsumar = (getSaldo()*interesAnualBasico*2);
        }
        this.ingresar(interesAsumar);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Cuenta ahorros: "+this.getNumeroCuenta()+" saldo: "+this.getSaldo());
    }

}
