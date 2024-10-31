import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        
        // Declara el Scanner
        var e = new Scanner(System.in);
        // Solicitar los 3 números por teclado
        System.out.println("<<< Media aritmetica de 3 numeros >>>");
        System.out.print("Ingrese el primer numero: ");
        var num1 = e.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        var num2 = e.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        var num3 = e.nextInt();

        // Calcular la media aritmetica
        var mediaAritemtica = (num1+num2+num3)/3;
        System.out.printf("La media aritmetica es: %d", mediaAritemtica);
        e.close();
    }
    
}
