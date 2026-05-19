import java.util.Scanner;

public class Ejercicio4_SumaRepetitiva {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String continuar = "si";

        while (continuar.equalsIgnoreCase("si")) {
            System.out.println("Ingrese el primer número:");
            double n1 = entrada.nextDouble();
            System.out.println("Ingrese el segundo número:");
            double n2 = entrada.nextDouble();

            double suma = n1 + n2;
            System.out.println("El resultado de la suma es: " + suma);

            System.out.println("¿Desea realizar otra suma? (Escriba 'si' para continuar):");
            continuar = entrada.next();
        }
        System.out.println("Programa finalizado. ¡Gracias!");
    }
}