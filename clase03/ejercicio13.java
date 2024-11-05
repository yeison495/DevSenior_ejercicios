package clase03;

import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        
        // Declarar el Scanner
        var e = new Scanner(System.in);
        // Ingreso de los 2 hermanos
        System.out.print("Ingrese el hermano que llega primero: ");
        var h1 = e.nextInt();
        System.out.print("Ingrese el hermano que llega segundo: ");
        var h2 = e.nextInt();

        // Validar cual hermano llega de último
        if (h1 != 1 && h2 != 1) {
            System.out.println("1");
        } else if (h1 != 2 && h2 != 2) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }
        e.close();
    }
    
}
