import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {

        // Declarar el Scanner
        var e = new Scanner(System.in);
        // Recibir valor por el usuario
        System.out.print("Ingrese un numero: ");
        var num = e.nextInt();
        // Validar si es positivo, negativo o cero
        if (num < 0) {
            System.out.println("El numero es negativo");
        } else if (num > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es 0");
        }
        e.close();
    }

}
