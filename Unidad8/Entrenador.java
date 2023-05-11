
package Unidad8;


public class Entrenador extends SeleccionFutbol{
    private String idFederacion;

    public Entrenador() {
        super();
    }

    public Entrenador(String idFederacion, int id, int edad, String nombre, String apellido) {
        super(id, edad, nombre, apellido);
        this.idFederacion = idFederacion;
    }

   
    

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public void concentrarse() {
        super.concentrarse(); 
    }

    @Override
    public void viajar() {
        super.viajar(); 
    }
    
    public void dirigirPartido(){
        System.out.println("Dirigir un partido");
        
    }
    
    public void dirigirEntrenamiento(){
        System.out.println("Dirige un entrenamiento");
        
    }
}
