import java.util.Scanner;

public class Ejercicio3_ParesEntreDos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer número (inicio):");
        int num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo número (fin):");
        int num2 = entrada.nextInt();

        int i = num1;
        System.out.println("Números pares entre " + num1 + " y " + num2 + ":");

        while (i <= num2) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}