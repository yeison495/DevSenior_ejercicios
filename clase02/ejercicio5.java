public class ejercicio5 {

    public static void main(String[] args) {
        // Valor toital del PC gamer con perifericos
        var precioTotal = 660;
        // Descuento del 10% por pronto pago
        var descuento = precioTotal*0.1;
        // Valor total del PC con el descuento aplicado
        var precioConDescuento = precioTotal-descuento;

        System.out.printf("Precio total del PC con perifericos: %d euros%n", precioTotal);
        System.out.printf("Descuento del 10 porciento por pronto pago: %.2f euros%n", descuento);
        System.out.printf("Precio con descuento: %.2f euros%n", precioConDescuento);

    }
    
}
