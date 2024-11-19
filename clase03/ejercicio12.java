import java.util.Scanner;

public class ejercicio12 {

    public static void main(String[] args) {
        
        // Declarar el Scanner
        var e = new Scanner(System.in);
        // Ingreso del peso de la sandia
        System.out.print("Ingrese el peso de la sandia: ");
        var peso = e.nextInt();
        // Validar y dividir en partes pares
        if (peso > 2 && peso % 2 == 0) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
        e.close();
    }
    
}
