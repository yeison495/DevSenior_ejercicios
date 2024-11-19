import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        
        // Declarar el Scanner
        var e = new Scanner(System.in);
        // Recibir valor por el usuario
        System.out.print("Ingrese un numero: ");
        var num = e.nextInt();
        // Validar si es par o impar
        if (num % 2 == 0) {
            System.out.printf("El numero %d es par", num);
        } else {
            System.out.printf("El numero %d es impar", num);
        }
        e.close();
    }
    
}
