
package Unidad1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Multiplo {
    public static void main(String[] args) {
         int num1, num2;
        Scanner num = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        num1= num.nextInt();
        System.out.print("Introduzca otro numero: ");
        num2= num.nextInt();
        if(num2%num1==0){
            System.out.printf("%d es multiplo de %d", num1,num2);
        }
        
    }
    
}
