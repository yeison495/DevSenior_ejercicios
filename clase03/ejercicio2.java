import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        
         // Declarar el Scanner
        var e = new Scanner(System.in);
        // Recibir valores por el usuario
        System.out.print("Ingrese el primer numero: ");
        var num1 = e.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        var num2 = e.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        var num3 = e.nextInt();
        // Validar cual número es el mayor
        if (num1 > num2 && num2 >num3) {
            System.out.printf("El numero mayor es: %d", num1);
        } else if (num1 > num2 && num2 < num3 && num3 < num1) {
            System.out.printf("El numero mayor es: %d", num1);
        } else if (num1 > num2 && num2 < num3 && num3 > num1) {
            System.out.printf("El numero mayor es: %d", num3);
        } else if (num1 < num2 && num2 > num3) {
            System.out.printf("El numero mayor es: %d", num2);
        } else if (num1 < num2 && num2 < num3) {
            System.out.printf("El numero mayor es: %d", num3);
        } 
        e.close();
    }
    
}
