package clase03;

import java.util.Scanner;

public class ejercicio19 {

    public static void main(String[] args) {
        
        // Declarar el scanner
        var e = new Scanner(System.in);
        // Usuario ingresa la cantidad de sucesiones para la seri de Fibonacci
        System.out.print("Ingrese la cantidad de sucesiones para la serie de Fibonacci: ");
        var cantSerie = e.nextInt();
        var a = 0;
        var b = 1;
        // Generar e imprimir la serie de Fibonacci
        for (int i = 0; i <= cantSerie; i++) {
            System.out.print(a + " ");
            var c = a + b;
            a = b;
            b = c;
        }
        e.close();
    }
    
}
