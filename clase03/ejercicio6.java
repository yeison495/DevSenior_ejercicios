import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
        
        // Declarar el Scanner
        var e = new Scanner(System.in);
        // Recibir valor por el usuario
        System.out.print("Ingrese un numero: ");
        var num = e.nextInt();
        // Validar si es divisible por 2 y 7
        System.out.println("Validar si el número es divisible por 2 y 7");
        if (num % 2 == 0 && num % 7 == 0) {
            System.out.printf("El numero %d es divisible por 2 y 7", num);
        } else if(num % 2 == 0 && num % 7 != 0){
            System.out.printf("El numero %d solo es divisible por 2", num);
        } else if(num % 2 != 0 && num % 7 == 0){
            System.out.printf("El numero %d solo es divisible por 7", num);
        } else {
            System.out.println("No es divisible por 2 y 7");
        }
        e.close();
    }
    
}
