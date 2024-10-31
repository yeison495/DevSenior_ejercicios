import java.util.Scanner;

public class ejercicio8 {
    
    public static void main(String[] args) {
        // Declarar el Scanner
        var e = new Scanner(System.in);
        // Valor base del rectangulo
        System.out.print("Ingrese la base del rectangulo: ");
        var base = e.nextInt();
        // Valor altura del rectangulo
        System.out.print("Ingrese la altura del rectangulo: ");
        var altura = e.nextInt();
        // Area del rectangulo
        System.out.println("<<<Calculo del área de un rectangulo>>>");
        var area = base*altura;
        System.out.printf("El area del rectangulo es: %d%n", area);
        // Perimetro del rectangulo
        System.out.println("<<<Calculo del perimetro de un rectangulo>>>");
        var perimetro = 2*(base+altura);
        System.out.printf("El perimetro del rectangulo es: %d%n", perimetro);
        // Cerrar el Scanner        
        e.close();
    }
}
