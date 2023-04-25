
package Unidad3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Kilomentraje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int kiloconducido,litrosutilizados, totalkilometros=0, totallitros=0; 
        double resul, resulfinal;
        int x=1;
        Scanner entrada= new Scanner(System.in);
        System.out.printf("Ingrese kilometros en viaje %d -99 para terminar: ",x);
        kiloconducido=entrada.nextInt();
        System.out.print("Ingrese litros utilizados ");
        litrosutilizados=entrada.nextInt();
        totalkilometros=totalkilometros+kiloconducido;
        totallitros=totallitros+litrosutilizados;
        while(kiloconducido!=-99){
            resul=(double)kiloconducido/litrosutilizados;
            System.out.printf("Kilometros por litros realizados en el viaje %d es: %.2f ", x,resul);
            System.out.println();
            System.out.printf("Ingrese kilometros en viaje %d -99 para terminar: ",x);
            kiloconducido=entrada.nextInt();
            if (kiloconducido!=-99){
                System.out.print("Ingrese litros utilizados ");
                litrosutilizados=entrada.nextInt();
              //  resul=(double)kiloconducido/litrosutilizados;
                totalkilometros=totalkilometros+kiloconducido;
                totallitros=totallitros+litrosutilizados;
                x++;

            }


        }
        resulfinal=(double)totalkilometros/totallitros;
        System.out.println("----------------------------------------------------------------------------");
        System.out.printf("\nTotal de kilometros realizados en %d viajes es %d",x, totalkilometros);
        System.out.printf("\nTotal de litros realizados en %d viajes es %d",x, totallitros);
        System.out.printf("\nKilometros por litros realizados en %d viajes es de %.2f", x,resulfinal);
    }

    
}
