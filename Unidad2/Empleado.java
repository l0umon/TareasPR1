
package Unidad2;

/**
 *
 * @author User
 */
public class Empleado {
    String nombre, apellidoPaterno, s="%";
    double salario, salarioAnual, aumento;

    public Empleado(String nombre, String apellidoPaterno, double salario) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.salario = salario;
    }

    public Empleado() {
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
      if (salario > 0) {
            this.salario = salario;
        }else{
            this.salario = 0;
    } }
    
    
   
    
    public double obtenerSalarioAnual(){
      salarioAnual=salario * 12;
      return salarioAnual;
    }
   
    public double obtenerAumento() {
       return aumento= salarioAnual +(salarioAnual*0.1) ;
    }
    
     public void mostrarDatos()
    {
        System.out.printf( "\nEl salario anual del empleado %s %s es: %.2f" , nombre,
                apellidoPaterno ,obtenerSalarioAnual() );
        System.out.printf( "\nEl salario anual del empleado %s %s  con un incremento del 10%s es: %.2f" , nombre,
                apellidoPaterno,s, obtenerAumento() );
        System.out.println("\n-----------------------------------------------------------------");
    } 
    
    
}
