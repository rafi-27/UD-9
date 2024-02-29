package EjerTemp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class primerEjer {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        try
        {
            System.out.println("Introduce numero: ");
            int valorA = sc.nextInt();
            System.out.println("El numero es: "+valorA);
        }
        catch(InputMismatchException valorException)
        {
            throw new InputMismatchException("Tiene que ser un valor de tipo entero.");
        }
    }

}
