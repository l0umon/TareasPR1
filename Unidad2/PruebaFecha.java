
package Unidad2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PruebaFecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dato = new Scanner( System.in );
        Fecha fecha = new Fecha();
        
        int dia; 
        int mes; 
        int anho;
        
        System.out.print( "Ingrese el numero del dia: " );
        dia = dato.nextInt();
        fecha.setDia(dia);
        
        System.out.print( "Ingrese el numero del mes: " );
        mes = dato.nextInt();
        fecha.setMes(mes);
       
        System.out.print( "Ingrese el año: " );
        anho = dato.nextInt();
        fecha.setAnho(anho);
       
        fecha.formatoFecha();
        
    }
    
}
