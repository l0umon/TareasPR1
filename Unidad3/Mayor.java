
package Unidad3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Mayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador=1, numero, mayor=0,vende=1 ;
        Scanner entrada= new Scanner(System.in);
        System.out.printf("Ingrese cantidad vendida por vendedor %d: ",contador);
        numero=entrada.nextInt();
        while(contador<=10){
            if(numero>mayor){
                mayor=numero;
                vende=contador;         
            }
            contador++;
            if(contador<=10){
            System.out.printf("Ingrese cantidad vendida por vendedor %d: ",contador);
            numero=entrada.nextInt();
  
            }
        }
        System.out.printf("La mayor cantidad vendida fue %d por el vendedor %d", mayor, vende);
    }
    
}
