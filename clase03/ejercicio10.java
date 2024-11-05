package clase03;

import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {
        
        // Declarar el Scanner
        var e = new Scanner(System.in);
        // Ingreso del número del mes
        System.out.print("Ingrese el número de del mes: ");
        var mes = e.nextInt();
        // Validar precio por unidad de camiseta
        if (mes > 0 && mes < 13) {
            if (mes == 2) {
                System.out.println("El mes tiene 28 días");
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                System.out.println("El mes tiene 30 días");
            } else {
                System.out.println("El mes tiene 31 días");
            }
        } else{
            System.out.println("Número de mes invalido");
        }
        
        e.close();
    }
    
}
