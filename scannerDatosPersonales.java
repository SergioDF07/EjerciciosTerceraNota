
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/
import java.util.Scanner;
public class scannerDatosPersonales
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su edad");
        int edad = scanner.nextInt();
        System.out.println("Ingrese su altura");
        double altura = scanner.nextDouble();
        System.out.println("Hola " + nombre + ", sus datos personales son:");
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
    }
}
