import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        // Declarar el Scanner
        var e = new Scanner(System.in);
        // Pedir por teclado los grados Celsius
        System.out.print( "Ingrese los grados celsius a convertir: ");
        var celsius = e.nextDouble();
        System.out.println("<<<Convertir de celsius a fahrenheit>>>");
        System.out.printf("Los grados celsius en fahrenheit seria: %.2f%n", celsius *(9/5)+32);
        System.out.println("<<<Convertir de celsius a kelvin>>>");
        System.out.printf("Los grados celsius en kelvin seria: %.2f%n", celsius + 273.15);
        e.close();
    }
    
}
