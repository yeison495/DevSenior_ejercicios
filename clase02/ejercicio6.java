public class ejercicio6 {
    
    public static void main(String[] args) {
        // Valor de los pantalones con el descuento aplicado
        var precioConDescuento = 34;
        // Descuento del 15%
        var descuento = 0.15;
        // Hallar el porcentaje del precio si se le aplico un descuento del 15%
        var precioOriginal = precioConDescuento / (1 - descuento);
        
        System.out.printf("El precio original de los pantalones era: %.2f euros%n", precioOriginal);

    }
}
