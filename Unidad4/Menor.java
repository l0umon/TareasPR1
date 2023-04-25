
package Unidad4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Menor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cant,aux,val,x=1;
        Scanner entrada= new Scanner(System.in);
        System.out.print("Introduzca cantidad de valores que desea introducir: ");
        cant=entrada.nextInt();
        aux=0;
        while(x<=cant){
            System.out.printf("Introduzca número de la interación %d: ", x);
            val=entrada.nextInt();
            
            if(val<aux){
                aux=val;
            }
           x++;
        }
        System.out.printf("El menor número entre %d valores introducidos es %d", cant, aux);
    }
    
}
