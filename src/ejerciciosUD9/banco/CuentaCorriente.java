package ejerciciosUD9.banco;

public class CuentaCorriente extends CuentaBancaria{
    /**
     * A la primera se le incrementará el saldo teniendo en cuenta el interés anual básico
     */
    public CuentaCorriente(String numeroCuenta, double saldo) {
        super(numeroCuenta, saldo);
    }

    @Override
    public void calcularIntereses() {
        double loQueAumenta = getSaldo()+(interesAnualBasico/100);
        this.ingresar(loQueAumenta);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Cuenta corriente: "+this.getNumeroCuenta()+" saldo: "+this.getSaldo());
    }
    
}
