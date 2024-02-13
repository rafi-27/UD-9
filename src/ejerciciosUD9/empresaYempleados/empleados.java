package ejerciciosUD9.empresaYempleados;

public class empleados {
    //Atriutos de los empleados:
    private final String nombre;
    private final String DNI;
    private double sueldoBrutoMensual;
    private int edad;
    private String telefono;
    private String direccion;    
    /**
     * Constructor con todos los datos:
     * @param nombre
     * @param dNI
     * @param sueldoBrutoMensual
     * @param edad
     * @param telefono
     * @param direccion
     */
    public empleados(String nombre, String dNI, double sueldoBrutoMensual, int edad, String telefono, String direccion) {
        this.nombre = nombre;
        this.DNI = dNI;
        this.sueldoBrutoMensual = sueldoBrutoMensual;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    
    /**
     * Getters y setters
     */
    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public double getSueldoBrutoMensual() {
        return sueldoBrutoMensual;
    }

    public void setSueldoBrutoMensual(double sueldoBrutoMensual) {
        this.sueldoBrutoMensual = sueldoBrutoMensual;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Metodo para visualizar toda la informacion:
     */
    /**
     * Constructor con todos los datos:
     * @param nombre
     * @param dNI
     * @param sueldoBrutoMensual
     * @param edad
     * @param telefono
     * @param direccion
     */
    void mostrarTodaLaInfo(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("DNI: "+this.DNI);
        System.out.println("Sueldo bruto mensual: "+this.sueldoBrutoMensual);
        System.out.println("Edad: "+this.edad);
        System.out.println("Telefono: "+this.telefono);
        System.out.println("Direccion: "+this.direccion);
    }
     
    void calcularSueldoNeto(){
        double sueldoNeto;
        if (getSueldoBrutoMensual()>0 && getSueldoBrutoMensual()*12 <= 12000) {
            //IRPF del 20%
            sueldoNeto=getSueldoBrutoMensual()-((getSueldoBrutoMensual()*0.20)); 
        }else if (getSueldoBrutoMensual()*12>12000 && getSueldoBrutoMensual()*12<=25000) {
            //IRPF del 30%
            sueldoNeto=getSueldoBrutoMensual()-((getSueldoBrutoMensual()*0.30));
        }else{
            //IRPF del 40%
            sueldoNeto=getSueldoBrutoMensual()-((getSueldoBrutoMensual()*0.40));
        }
        System.out.println("Sueldo neto: "+sueldoNeto);
    }



}
