import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {
        // Declarar el Scanner
        var e = new Scanner(System.in);
        // Valor número 1
        System.out.print("Ingrese el primer número: ");    
        var numero1 = e.nextInt();
        // Valor número 2
        System.out.print("Ingrese el segundo número: ");
        var numero2 = e.nextInt();
        // Suma
        var suma = numero1 + numero2;
        System.out.printf("El resultado utilizando la suma es: %d%n", suma);
        // Resta
        var resta = numero1 - numero2;
        System.out.printf("El resultado utilizando la resta es: %d%n", resta);
        // Multiplicación
        var multiplicacion = numero1 * numero2;
        System.out.printf("El resultado utilizando la multiplicación es: %d%n", multiplicacion);
        // División
        var division = numero1 / numero2;
        System.out.printf("El resultado utilizando la división es: %d%n", division);
        e.close();
    }
    
}
