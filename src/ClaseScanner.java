import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ClaseScanner {
    private Integer numero;
    private String cadena;

    public Integer getNumero() {
        return numero;
    }

    public void numeroScanner()
    {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println(" Ingrese un numero... ");
            this.numero = scanner.nextInt();
            scanner.nextLine();/**El método nextInt de Scanner consume
             todo los números que encuentre, y nada más. Eso quiere decir que el
             salto de línea que pulsas al introducir tu número, y que en el buffer del Scanner se guarda como \n, no se consume:*/

            System.out.println(" Ingrese una cadena... ");
            this.cadena = scanner.nextLine();

            System.out.println("El numero ingresado es: " + this.numero);
            System.out.println("La cadena ingresado es: " + this.cadena);
        }catch (InputMismatchException e)
        {
            System.out.println("ERROR, ingrese un numero" + e.getMessage());
            //llamada recursiva
            this.numeroScanner();
        }


    }
}
