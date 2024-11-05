package clase03;

import java.util.Scanner;

public class ejercicio15 {

    public static void main(String[] args) {
        
        // Declarar el Scanner
        var e = new Scanner(System.in);
        // Calcular el cubo y terminar programa al ingresar un número negativo
        var num = 0;
        do {
            // Ingreso el número a validar si es negativo o positivo
            System.out.print("Ingrese el número: ");
            num = e.nextInt();
            if (num > 0) {
                System.out.printf("El número %d es positivo %n", num);
            } else if (num < 0) {
                System.out.printf("El número %d es negativo %n", num);
            } else {
                System.out.printf("El número es 0 se cerrara el programa...", num);
            }
        } while (num != 0);

        e.close();
    }
    
}
