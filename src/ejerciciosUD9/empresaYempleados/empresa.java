package ejerciciosUD9.empresaYempleados;

import java.util.ArrayList;

public class empresa {
    private final String nombreEmpresa;
    private final String CIF;
    private String telefono;
    private String direccionEmpresa;
    ArrayList<empleados>listaEmpleados = new ArrayList<>();
    /**
     * Constructor de empresa.
     * @param nombreEmpresa
     * @param cIF
     * @param telefono
     * @param direccionEmpresa
     * @param listaEmpleados
     */
    public empresa(String nombreEmpresa, String cIF, String telefono, String direccionEmpresa,
            ArrayList<empleados> listaEmpleados) {
        this.nombreEmpresa = nombreEmpresa;
        CIF = cIF;
        this.telefono = telefono;
        this.direccionEmpresa = direccionEmpresa;
        this.listaEmpleados = listaEmpleados;
    }
    
    

    




}
