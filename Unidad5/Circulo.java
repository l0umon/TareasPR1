package Unidad5;

import java.util.Scanner;

/**
 *
 * @author l0umon
 */
public class Circulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escriba la cantidad de circulos para calcular su area: ");
        int cant = entrada.nextInt();
        for (int i = 1; i <= cant; i++) {
            System.out.println("******************************");
            System.out.printf("Escriba radio del circulo %d: ", i);
            double radio = entrada.nextDouble();
            double perimetro = circuloPerimetro(radio);
            System.out.printf("El perimetro del circulo es: %.2f", perimetro);
            System.out.println();
            double area = circuloArea(radio);
            System.out.printf("El area del circulo es: %.2f", area);
            System.out.println();

        }
    }

    private static double circuloPerimetro(double radio) {
        double r;
        r = 2 * Math.PI * radio;
        return r;
    }

    private static double circuloArea(double radio) {
        double r;
        r = Math.PI * Math.pow(radio, 2);
        return r;
    }

}
