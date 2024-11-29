public class banco
{
    public static void main(String[] args) {
        int amountMoney = 1000;
        final int MONEYWITHDRAWN = 200;
        
        amountMoney -= MONEYWITHDRAWN; 
        System.out.println("El dinero restante en la semana 1 en el banco  es de: " + amountMoney);
        amountMoney -= MONEYWITHDRAWN; 
        System.out.println("El dinero restante en la semana 2 en el banco  es de: " + amountMoney);
        amountMoney -= MONEYWITHDRAWN; 
        System.out.println("El dinero restante en la semana 3 en el banco  es de: " + amountMoney);
        amountMoney -= MONEYWITHDRAWN; 
        System.out.println("El dinero restante en la semana 4 en el banco  es de: " + amountMoney);
    }
}