import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {
        
        // Declarar el Scanner
        var e = new Scanner(System.in);
        // Ingreso de los tres lados
        System.out.print("Ingrese la longitud del primer lado: ");
        var lado1 = e.nextDouble();
        
        System.out.print("Ingrese la longitud del segundo lado: ");
        var lado2 = e.nextDouble();
        
        System.out.print("Ingrese la longitud del tercer lado: ");
        var lado3 = e.nextDouble();

        // Validar combinaciones para formar triagulo
        if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
            System.out.println("Los lados pueden formar un triángulo.");
        } else {
            System.out.println("Los lados no pueden formar un triángulo.");
        }
        e.close();
    }
    
}
