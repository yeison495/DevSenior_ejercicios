package clase03;

import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {
        
        // Declarar el Scanner
        var e = new Scanner(System.in);
        // Ingreso de la cantidad de camisetas
        System.out.print("Ingrese el número de camisetas: ");
        var cant = e.nextInt();
        // Validar precio por unidad de camiseta
        if (cant > 0 && cant < 51) {
            System.out.println("El precio por unidad de camisa es de: $50000");
            System.out.printf("el precio total de las camisas es de: $%d", cant*50000);
        } else if (cant >= 50 && cant < 101) {
            System.out.println("El precio por unidad de camisa es de: $45000");
            System.out.printf("el precio total de las camisas es de: $%d", cant*45000);
        } else if (cant >= 100 && cant < 151) {
            System.out.println("El precio por unidad de camisa es de: $40000");
            System.out.printf("el precio total de las camisas es de: $%d", cant*40000);
        } else if (cant >= 150 && cant < 201) {
            System.out.println("El precio por unidad de camisa es de: $35000");
            System.out.printf("el precio total de las camisas es de: $%d", cant*35000);
        } else {
            System.out.println("El precio por unidad de camisa es de: $25000");
            System.out.printf("el precio total de las camisas es de: $%d", cant*25000);
        }
        e.close();
    }
    
}
