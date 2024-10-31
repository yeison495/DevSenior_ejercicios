public class ejercicio1 {
    public static void main(String[] args) {
        // Operación: 6 / 2 ( 1 + 2 )
        int resultado=6/2*(1+2);
        System.out.println("El resultado es: " + resultado);
        System.out.println("\nExplicación:");
        System.out.println("El resultado es 9 debido al orden de la jerarquia de operadores:");
        System.out.println("1. Primero se resuelve (1 + 2) = 3");
        System.out.println("2. Luego se evalúa de izquierda a derecha: 6 / 2 = 3");
        System.out.println("3. Finalmente: 3 * 3 = 9");
        System.out.println("\nAlgunas calculadoras pueden dar 1 como resultado porque:");
        System.out.println("- Interpretan 2(1+2) como un denominador completo");
        System.out.println("- Es decir, lo interpretan como: 6 / (2 * (1+2))");
        System.out.println("- Lo cual daría: 6 / (2 * 3) = 6/6 = 1");
    }
}
