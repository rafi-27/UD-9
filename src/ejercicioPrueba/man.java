package ejercicioPrueba;

public class man {
    public static void main(String[] args) {
        personas uno = new empleados("null", "null"," null", "null", "null", "null", 1500);
        personas uno_V2 = new empleados("null", "null"," null", "null", "null", "null", 1500);

        personas.aniadir(uno);
        personas.aniadir(uno_V2);
        personas.mostrarTodo();
    }
}
