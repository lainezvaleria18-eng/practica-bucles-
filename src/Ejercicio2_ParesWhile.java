import java.util.Scanner;

public class Ejercicio2_ParesWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        int limite = entrada.nextInt();

        int i = 0;
        System.out.println("Los números pares entre 0 y " + limite + " son:");

        while (i <= limite) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}