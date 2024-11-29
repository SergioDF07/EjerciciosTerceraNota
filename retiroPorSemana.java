
public class retiroPorSemana
{
    public static void main(String[] args) {
        int cantidadInicial = 1000;
        int retiroPorSemana;
        int counter = 1;
        while (counter<5) {
            cantidadInicial -= 200;
            System.out.println("Cantidad restante en la semana " + counter + ": " + cantidadInicial);
            counter++;
        }
    }
}