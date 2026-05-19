import java.util.Scanner;

public class Ejercicio7_TablaMultiplicar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número para ver su tabla de multiplicar:");
        int tabla = entrada.nextInt();

        System.out.println("--- Tabla del " + tabla + " ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(tabla + " x " + i + " = " + (tabla * i));
        }
    }
}