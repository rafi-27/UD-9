package ejercicioPrueba;

public class empleados extends personas{
    protected String antiguedad;
    protected String telefono;
    protected double salario;
    
    /**
     * @param nombre
     * @param apellidos
     * @param dNI
     * @param direccion
     * @param antiguedad
     * @param telefono
     * @param salario
     */
    public empleados(String nombre, String apellidos, String dNI, String direccion, String antiguedad, String telefono,
            double salario) {
        super(nombre, apellidos, dNI, direccion);
        this.antiguedad = antiguedad;
        this.telefono = telefono;
        this.salario = salario;
    }

    public String getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(String antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString()+ " antiguedad=" + antiguedad + ", telefono=" + telefono + ", salario=" + salario;
    }
    
}
