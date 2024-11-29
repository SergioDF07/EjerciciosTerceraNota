

public class tiendaDeRopa
{
    public static void main(String[] args) {
        int precioCamiseta = 25;
        int precioPantalon = 30;
        double precioDescuentoCamiseta1 = precioCamiseta * 0.85;
        double precioDescuentoPantalon =  precioPantalon * 0.85;
        double precioTotal = precioDescuentoPantalon + precioDescuentoCamiseta1;
        System.out.println("Precio de la camiseta en descuento: " + precioDescuentoCamiseta1);
        System.out.println("precio del pantalon en descuento: " + precioDescuentoPantalon);
        System.out.println("El precio del pantalon y la camisa es de: " + precioTotal);
        double precioDescuentoCamiseta2 = precioDescuentoCamiseta1 * 0.95;
        precioTotal += precioDescuentoCamiseta2;
        System.out.println("Con la segunda camiseta se le descuenta el precio de la primera a un costo de: " + precioDescuentoCamiseta2);
        System.out.println("El precio total de la compra es de: " + precioTotal);
        
    }
}
