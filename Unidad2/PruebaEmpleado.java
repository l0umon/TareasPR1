
package Unidad2;

import java.util.Scanner;

/**
 *
 * @author l0umon
 */
public class PruebaEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado emple1 = new Empleado();
        Empleado emple2 = new Empleado();

        Scanner dato1 = new Scanner(System.in);
        Scanner dato2 = new Scanner(System.in);

        System.out.print("Ingrese nombre del primer empleado: ");
        emple1.setNombre(dato1.nextLine());
        System.out.print("Ingrese apellido del primer empleado: ");
        emple1.setApellidoPaterno(dato1.nextLine());
        System.out.print("Ingrese salario del primer empleado: ");
        emple1.setSalario(dato1.nextDouble());
        
        System.out.println("---------------------------------------");
        
        System.out.print("Ingrese nombre del segundo empleado: ");
        emple2.setNombre(dato2.nextLine());
        System.out.print("Ingrese apellido del segundo empleado: ");
        emple2.setApellidoPaterno(dato2.nextLine());
        System.out.print("Ingrese salario del segundo empleado: ");
        emple2.setSalario(dato2.nextDouble());

       
       emple1.mostrarDatos();
       emple2.mostrarDatos();
       
    }
    
    
    
}
