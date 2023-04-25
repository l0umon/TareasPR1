
package Unidad5;

import java.util.Scanner;

/**
 *
 * @author l0umon
 */
public class Triangulo {

    
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.print("Escriba la cantidad de triangulos para calcular su hipotenusa: ");
        int cant= entrada.nextInt();
        
        for (int i = 1; i <= cant; i++) {
            System.out.println("Triangulo " + i);
            System.out.println("***************************");
            System.out.print("Escriba la longitud lado 1: ");
            double lado1= entrada.nextDouble();
            System.out.print("Escriba la longitud lado 2: ");
            double lado2= entrada.nextDouble();
            double resultado = hipotenusa(lado1,lado2);
            System.out.printf("La hipotenusa del triangulo es: %.2f" , resultado );
            System.out.println();
        }
        
    }
    public static double hipotenusa(double x, double y){
      
       return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}
