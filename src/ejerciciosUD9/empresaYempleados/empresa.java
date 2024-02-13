package ejerciciosUD9.empresaYempleados;

import java.util.ArrayList;

public class empresa {
    private final String nombreEmpresa;
    private final String CIF;
    private String telefono;
    private String direccionEmpresa;
    private ArrayList<empleados>listaEmpleados = new ArrayList<>();
    /**
     * Constructor de empresa.
     * @param nombreEmpresa
     * @param cIF
     * @param telefono
     * @param direccionEmpresa
     * @param listaEmpleados
     */
    public empresa(String nombreEmpresa, String cIF, String telefono, String direccionEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        CIF = cIF;
        this.telefono = telefono;
        this.direccionEmpresa = direccionEmpresa;
        //this.listaEmpleados = listaEmpleados;
    }
    
    /**
     * Metodos ordenados.
     * @param empleado
     */
    void añadir_Eliminar(empleados empleado, boolean option){
        if (option) {//Si es true lo añade y si es false lo borra buscandolo por dni.
            listaEmpleados.add(empleado);
        }else if (!option) {
            for (empleados empleaBorrar : listaEmpleados) {
                if (empleaBorrar.getDNI().equals(empleado.getDNI())) {
                    listaEmpleados.remove(empleaBorrar);
                }
            }
        }
    }

    void mostrarInfoDeTodos(){
        for (empleados empleado : listaEmpleados) {
            empleado.mostrarTodaLaInfo();
            System.out.println();
        }
    }

    void mostraDatosConcretos(){
        for (empleados empleado : listaEmpleados) {
            System.out.println(empleado.getDNI()+" sueldo bruto: "+empleado.getSueldoBrutoMensual()+" sueldo neto: "+empleado.calcularSueldoNeto());
        }
    }

    //Calcular la suma total de sueldos brutos de todos los empleados
    void calcularTodosLosSueldosBrutos(){
        double total=0;
        for (int i = 0; i < listaEmpleados.size(); i++) {
            total+=listaEmpleados.get(i).getSueldoBrutoMensual();
        }
        System.out.println("Suma total de los sueldos brutos: "+total);
    }

    //Mostrar el resultado de sumar todos los sueldos netos:
    void calcularTodosLosSueldosNetos(){
        double precioNetoindividual = 0;
        for (empleados empleado : listaEmpleados) {
            precioNetoindividual+=empleado.calcularSueldoNeto();
        }
        System.out.println("Suma total de los sueldos netos: "+precioNetoindividual);
    }

}
