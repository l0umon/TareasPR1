
package Unidad8;

/**
 *
 * @author Desarrollo
 */
public class Fultbolista extends SeleccionFutbol{
    private int cantidadGoles;
    private String posocion;

    public Fultbolista() {
           super();
    }

    public Fultbolista(int cantidadGoles, String posocion, int id, int edad, String nombre, String apellido) {
        super(id, edad, nombre, apellido);
        this.cantidadGoles = cantidadGoles;
        this.posocion = posocion;
    }

    @Override
    public void concentrarse() {
        super.concentrarse(); 
    }

    @Override
    public void viajar() {
        super.viajar(); 
    }
    
    public void jugarPartido(){
        System.out.println("Juega un partido");
    }

    public void entrenar(){
        System.out.println("Entrena");
    }
    public int getCantidadGoles() {
        return cantidadGoles;
    }

    public void setCantidadGoles(int cantidadGoles) {
        this.cantidadGoles = cantidadGoles;
    }

    public String getPosocion() {
        return posocion;
    }

    public void setPosocion(String posocion) {
        this.posocion = posocion;
    }
    
    
}
