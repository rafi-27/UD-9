package ejerciciosUD9.figuras;

import java.util.ArrayList;

public class Programafiguras {
    public static void main(String[] args) {
        // Creo el arraylist para almacenar figuras:
        ArrayList<IFigura2D> listaFiguras = new ArrayList<>();
        //Creamos las figuras:
        Cuadrado cuadrado = new Cuadrado(7);
        Rectangulo rectangulo = new Rectangulo(9, 3);
        Triangulo triangulo = new Triangulo(10, 5);
        Circulo circulo = new Circulo(5);
        //Metemos las figuras en la lista:
        listaFiguras.add(cuadrado);
        listaFiguras.add(rectangulo);
        listaFiguras.add(triangulo);
        listaFiguras.add(circulo);
        //Mostramos la informacion de la lista:
        for (IFigura2D figura : listaFiguras) {
            figura.imprimir();
        }
        //Escalamos algunos y comprobamos que le cambia el valor:
        cuadrado.escalar(0.5);
        triangulo.escalar(2);
        rectangulo.escalar(-2);
        circulo.escalar(8);
        System.out.println("-----Next Lista-----");
        //Mostramos la informacion de la lista:
        for (IFigura2D figura : listaFiguras) {
            figura.imprimir();
        }
    }
}
