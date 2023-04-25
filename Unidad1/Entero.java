package Unidad1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Entero {
    public static void main(String[] args) {
        int num1, num2,mul, div,suma, res;
        Scanner num = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        num1= num.nextInt();
        System.out.print("Introduzca otro numero: ");
        num2= num.nextInt();
        mul= num1*num2;
        div= num1/num2;
        suma=num1 + num2;
        res=num1-num2;
        
        if(num1==num2){
            System.out.printf("%d * %d = %d ", num1,num2,mul);
        }
        if(num1>num2){
            System.out.printf("%d / %d = %d ", num1,num2,div);
        }
         if(num1<num2){
            System.out.printf("%d + %d = %d ", num1,num2,suma);
             System.out.println();
            System.out.printf("%d - %d = %d ", num1,num2, res);

        }
        
        
        
        
    }
    
}
