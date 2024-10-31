public class ejercicio2 {
    public static void main(String[] args) {
        // Precio del producto por 100 gramos
        double precioPorcion = 5.95;
        // Calcular el precio por kilo (1000 gramos)
        double precioCalculadoPorKilo = precioPorcion * (1000/100); 
        // Precio por kilo indicado por el vendedor
        double precioVendedorPorKilo = 29.75;
        
        System.out.println("Análisis de precios del Pernil Iberic:");
        System.out.printf("Precio por 100 gramos: %.2f%n", precioPorcion);
        System.out.printf("Precio por kilo calculado: %.2f%n", precioCalculadoPorKilo);
        System.out.printf("Precio por kilo del vendedor: %.2f%n", precioVendedorPorKilo);
        
        if ((precioCalculadoPorKilo - precioVendedorPorKilo) < 0.01) {
            System.out.println("\nEl precio indicado por el vendedor es correcto.");
        } else {
            System.out.println("\nEl precio indicado por el vendedor NO es correcto.");
            System.out.printf("La diferencia es de %.2f%n", (precioCalculadoPorKilo - precioVendedorPorKilo));
                
        }
    }
}
