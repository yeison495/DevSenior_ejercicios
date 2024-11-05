package clase03;

import java.util.Random;

public class ejercicio18 {

    public static void main(String[] args) {
        
        var random = new Random();
        var sumarNegativos = 0; 
        var sumarPositivos = 0;
        var mediaNegativos = 0;
        var mediaPositivos = 0;
        var cantNegativos = 0;        
        var cantPositivos = 0; 
        var cantCeros = 0;       

        for (int i = 0; i < 120; i++) {
            var numeroAleatorio = random.nextInt((100 - -100) +1) +-100;
            if (numeroAleatorio < 0) {
                sumarNegativos += numeroAleatorio;
                cantNegativos++;
            } else if (numeroAleatorio > 0) {
                sumarPositivos += numeroAleatorio;
                cantPositivos++;
            } else if (numeroAleatorio == 0) {
                cantCeros++;
            }
            System.out.println("Número aleatorio " + (i + 1) + ": " + numeroAleatorio);
        }
        mediaNegativos = sumarNegativos/cantNegativos;
        mediaPositivos = sumarPositivos/cantPositivos;
        System.out.printf("La suma de los números negativos es: %d %n", sumarNegativos);
        System.out.printf("La cantidad de números negativos es: %d %n", cantNegativos);
        System.out.printf("La media de los números negativos es: %d %n", mediaNegativos);
        System.out.printf("La suma de los números positivos es: %d %n", sumarPositivos);
        System.out.printf("La cantidad de números positivos es: %d %n", cantPositivos);
        System.out.printf("La media de los números positivos es: %d %n", mediaPositivos);
        System.out.printf("La cantidad de ceros es: %d %n",cantCeros);
    }
    
}
