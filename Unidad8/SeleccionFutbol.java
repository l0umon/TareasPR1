
package Unidad8;

/**
 *
 * 
 * @author Desarrollo
 */
public class SeleccionFutbol {
    protected int id, edad;
    protected String nombre, apellido;

    public SeleccionFutbol() {
    }

    public SeleccionFutbol(int id, int edad, String nombre, String apellido) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    
    public void concentrarse(){
        System.out.println("Concentrarse");
    }
     public void viajar(){
          System.out.println("Viajar");
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
}
