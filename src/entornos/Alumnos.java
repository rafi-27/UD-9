package entornos;

import java.util.ArrayList;

public class Alumnos {
    String nombreYapellidos;
    String dni;
    String email;
    String telefono;
    double nota;
    
    public Alumnos(String nombreYapellidos, String dni, String email, String telefono, double nota) {
        this.nombreYapellidos = nombreYapellidos;
        this.dni = dni;
        this.email = email;
        this.telefono = telefono;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "NIF=" + dni+" Nombre=" + nombreYapellidos + ", email=" + email + ", telefono="
                + telefono + ", nota=" + nota + "]";
    }



    public static void main(String[] args) {
        ArrayList<Alumnos>listaAlumnos= new ArrayList<>();
        Alumnos jose = new Alumnos("Jose Sanchez","786532f","hotmail@hotmail.com","6354875222",8.54);
        Alumnos abdel = new Alumnos("Abdelilah souidi","4787532r","abdelilahsuidi@gmail.com","565487554",7.21);
        Alumnos pedro = new Alumnos("Pedro Sanchex","6578493X","pepe@gmail.com","4563789",4.24);
        Alumnos cristiano = new Alumnos("Cristiano Ronaldo","67896543l","raphaelRonaldo@gmail.com","7845962i",1.5);

        listaAlumnos.add(jose);
        listaAlumnos.add(abdel);
        listaAlumnos.add(pedro);
        listaAlumnos.add(cristiano);

        for (Alumnos alumno : listaAlumnos) {
            System.out.println(alumno.toString());
        }
    }

}
