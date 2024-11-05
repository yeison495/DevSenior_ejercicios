package clase03;

import java.util.Scanner;

public class ejercicio11 {

    public static void main(String[] args) {
        
        // Declarar el Scanner
        var e = new Scanner(System.in);
        // Ingreso de los tres lados
        System.out.print("Ingrese el primer número: ");
        var num1 = e.nextInt();
        System.out.print("Ingrese el segundo número: ");
        var num2 = e.nextInt();
        System.out.print("Ingrese el tercer número: ");
        var num3 = e.nextInt();

        // Validación para asegurar que los números son diferentes
        if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("Por favor, ingrese números diferentes.");
        } else{
                    // Ordenarlo de manera ascendente
        if (num1 < num2 && num2 < num3) {
            System.out.printf("%d%d%d",num1,num2,num3);
        } else if (num1 < num2 && num2 > num3 && num3 > num1) {
            System.out.printf("%d%d%d",num1,num3,num2);
        } else if (num1 < num2 && num2 > num3 && num3 < num1) {
            System.out.printf("%d%d%d",num3,num1,num2);
        } else if (num1 > num2 && num2 < num3 && num3 > num1) {
            System.out.printf("%d%d%d",num2,num1,num3);
        } else if (num1 > num2 && num2 < num3 && num3 < num1) {
            System.out.printf("%d%d%d",num2,num3,num1);
        } else if (num1 > num2 && num2 > num3 && num3 < num1) {
            System.out.printf("%d%d%d",num3,num2,num1);
        } else if (num1 > num2 && num2 > num3 && num3 > num1) {
            System.out.printf("%d%d%d",num3,num2,num1);
        }
        }

        e.close();
    }
    
}
