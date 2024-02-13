package ejerciciosUD9.empresaYempleados;

public class programaEm {
    public static void main(String[] args) {
        /**
         * Crear una empresa:(No tiene empleados)
         */
        empresa phoneHouse = new empresa("Phone House", "0125", "631125487", "Calle Luna");

        //Creamos un empleado:
        empleados juan = new empleados("Jose Davila", "E984651", 1500, 19, "87654398765", "calle joselito");
        empleados manuela = new empleados("Jose Davila", "E985851", 1800, 19, "87654398765", "calle joselito");
        //Llamamos a los metodos para agregarle empleados:
        phoneHouse.añadir_Eliminar(juan,true);
        phoneHouse.añadir_Eliminar(manuela, true);
        
        
        phoneHouse.mostraDatosConcretos();
        phoneHouse.mostrarInfoDeTodos();

        //Mostrar el resultado de sumar todos los sueldos brutos:
        phoneHouse.calcularTodosLosSueldosBrutos();
        System.out.println();
        //Mostrar el resultado de sumar todos los sueldos netos:
        phoneHouse.calcularTodosLosSueldosNetos();
    }
}
