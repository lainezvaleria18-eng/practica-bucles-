import java.util.Scanner;

public class Ejercicio5_AcumuladorDoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero, sumaTotal = 0;
        String respuesta;

        do {
            System.out.println("Ingrese un número para sumarlo a la cuenta:");
            numero = entrada.nextDouble();
            sumaTotal += numero;

            System.out.println("¿Desea ingresar otro número? (si/no):");

            respuesta = entrada.next();
        } while (respuesta.equalsIgnoreCase("si"));

        System.out.println("La suma acumulada de todos los números ingresados es: " + sumaTotal);
        entrada.close();
    }
}