
package Unidad4;

import java.util.Scanner;

/**
 *
 * @author Desarrollo
 */
public class VentaMinorista {

    public static void main(String[] args) {
        double produc1=2.98,produc2=4.50,produc3=9.98,produc4=4.49, produc5=6.87;
        int uno=0, dos=0, tres=0, cuatro=0, cinco=0, cantvendi=0;
        int num;
        Scanner entrada= new Scanner(System.in);
        System.out.print("Introduzca numero de producto(1-5) o -99 para finalizar ");
        num=entrada.nextInt();
        
        while (num!=-99){
            switch (num) {
                case 1:
                    System.out.print("Introduzca cantidad vendida ");
                    cantvendi=entrada.nextInt();
                    uno+=cantvendi;
                    break;
                case 2:
                    System.out.print("Introduzca cantidad vendida ");
                    cantvendi=entrada.nextInt();
                    dos+=cantvendi;
                    break; 
                case 3:                   
                    System.out.print("Introduzca cantidad vendida ");
                    cantvendi=entrada.nextInt();
                    tres+=cantvendi;
                    break;
                case 4:
                    System.out.print("Introduzca cantidad vendida ");
                    cantvendi=entrada.nextInt();
                    cuatro+=cantvendi;
                    break;
                case 5:
                    System.out.print("Introduzca cantidad vendida ");
                    cantvendi=entrada.nextInt();
                    cinco+=cantvendi;
                    break;
                default:
                    System.out.println("Numero  de producto no valido");

            }
            System.out.print("Introduzca numero de producto(1-5) o -99 para finalizar ");
            num=entrada.nextInt();
        }   
        System.out.println("Reporte de ventas: ");
        System.out.println("*******************************");
        System.out.println("El total de ventas del producto 1 es de: " + uno*produc1 );
        System.out.println("El total de ventas del producto 2 es de: " + dos*produc2 );
        System.out.println("El total de ventas del producto 3 es de: " + tres*produc3 );
        System.out.println("El total de ventas del producto 4 es de: " + cuatro*produc4 );
        System.out.println("El total de ventas del producto 5 es de: " + cinco*produc5);
    }
    
}
