import java.util.Scanner;

public class ejercicio16 {

    public static void main(String[] args) {
        
        // Declarar el Scanner
        var e = new Scanner(System.in);
        // Ingresar números negativos y contarlos
        var num = 0;
        var count = 0;
        do {
            System.out.print("Ingrese el número: ");
            num = e.nextInt();
            if (num < 0) {
                System.out.printf("El número %d es negativo %n", num);
                count++;
            } else if (num == 0) {
                System.out.printf("El número es 0.... %n", num);
            }
        } while (num <= 0);
        System.out.printf("La cantidad de números negativos ingresados es: %d", count);
        e.close();
    }
    
}
