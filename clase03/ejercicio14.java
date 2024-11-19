import java.util.Scanner;

public class ejercicio14 {

    public static void main(String[] args) {
        
        // Declarar el Scanner
        var e = new Scanner(System.in);
        // Calcular el cubo y terminar programa al ingresar un número negativo
        var num = 0;
        do {
            // Ingreso el número a calcular el cubo
            System.out.print("Ingrese el número: ");
            num = e.nextInt();
            if (num >= 0) {
                var cubo = num * num * num;
                System.out.printf("El cubo de %d es: %d%n", num, cubo);
            }
        } while (num >= 0);

        e.close();
    }
    
}
