package clase03;

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        
        // Declarar el Scanner
        var e = new Scanner(System.in);
        // Recibir valor por el usuario y convertimos a minúscula
        System.out.print("Ingrese una letra: ");
        char letra = e.next().toLowerCase().charAt(0); 
        // Verificar si el carácter es una letra
        if (Character.isLetter(letra)) {
            // Comprobar si es vocal
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                System.out.println("La letra '" + letra + "' es una vocal.");
            } else {
                System.out.println("La letra '" + letra + "' es una consonante.");
            }
        } else {
            System.out.println("El carácter ingresado no es una letra.");
        }

        e.close();
    }
    
}
