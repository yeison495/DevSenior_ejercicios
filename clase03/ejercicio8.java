package clase03;

import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {

        // Declarar el Scanner
        var e = new Scanner(System.in);
        // Ingreso de la edad
        System.out.print("Ingrese su edad: ");
        var edad = e.nextInt();
        // Validar la etapa a la que perteneces
        if (edad >= 0 && edad < 6) {
            System.out.println("Estas en la etapa de la primera infancia");
        } else if (edad >= 6 && edad < 12) {
            System.out.println("Estas en la etapa de la infancia");
        } else if (edad >= 12 && edad < 19) {
            System.out.println("Estas en la etapa de la adolescente");
        } else if (edad >= 19 && edad < 27) {
            System.out.println("Estas en la etapa de la juventud");
        } else if (edad >= 27 && edad < 60) {
            System.out.println("Estas en la etapa de la adultez");
        } else {
            System.out.println("Estas en la etapa de persona mayor");
        }
        e.close();
    }

}
