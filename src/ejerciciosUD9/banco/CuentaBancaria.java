package ejerciciosUD9.banco;
public abstract class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    protected static final double interesAnualBasico=2.5;

    /**
     * Constructor para iniciar una cuenta.
     * @param numeroCuenta
     * @param saldo
     */
    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    
    /**
     * Getters y setters
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    //Metodos:
    void ingresar(double cantidad){
        if (cantidad > 0) {
            this.saldo+=cantidad;
        }
    }
    void retirar(double cantidadAretirar){
        if (cantidadAretirar <= this.saldo) {
            this.saldo-=cantidadAretirar;
        }
    }
    void traspaso(CuentaBancaria cuentaAlaQueSeTraspasa, double cantidadATraspasar){
        cuentaAlaQueSeTraspasa.ingresar(cantidadATraspasar);
        this.retirar(cantidadATraspasar);
    }

    /**
     * Metodo para mostrar los datos.
     */
    public abstract void mostrarDatos();

    /**
     * Metodo abstracto:
     */
    public abstract void calcularIntereses();
}
