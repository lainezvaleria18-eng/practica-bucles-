import java.util.Scanner;

public class Ejercicio1_Descuentos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double compra, descuento = 0, totalPagar;
        String etiqueta;

        System.out.println("Ingrese el monto de la compra:");
        compra = entrada.nextDouble();
        System.out.println("Ingrese el color de la etiqueta (verde, roja, azul, dorada):");
        etiqueta = entrada.next().toLowerCase();

        switch (etiqueta) {
            case "verde":
                descuento = compra * 0.05;
                break;
            case "roja":
                descuento = compra * 0.10;
                break;
            case "azul":
                descuento = compra * 0.15;
                break;
            case "dorada":
                descuento = compra * 0.20;
                break;
            default:
                System.out.println("Color de etiqueta no válido. Sin descuento.");
                break;
        }

        totalPagar = compra - descuento;
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Monto total a pagar: $" + totalPagar);
    }
}