import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        
        // Declarar el Scanner
        var e = new Scanner(System.in);
        // Recibir valor por el usuario
        System.out.print("Ingrese la letra: ");
        char letra = e.next().charAt(0);
        // Validar si es minuscula, mayúscula o carater especial
        if (Character.isUpperCase(letra)) {
            System.out.printf("La letra '" + letra + "' es mayúscula.");
        } else if (Character.isLowerCase(letra)) {
            System.out.println("La letra '" + letra + "' es minúscula.");
        } else {
            System.out.println("El carácter ingresado no es una letra.");
        }
        e.close();
    }
    
}
