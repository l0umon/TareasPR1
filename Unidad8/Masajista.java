
package Unidad8;

/**
 *
 * @author Desarrollo
 */
public class Masajista extends SeleccionFutbol{
    private String titulacion;
    private int aniosExperiencia;

    public Masajista() {
           super();
    }

    public Masajista(String titulacion, int aniosExperiencia, int id, int edad, String nombre, String apellido) {
        super(id, edad, nombre, apellido);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }
    
    

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
    
    

    @Override
    public void concentrarse() {
        super.concentrarse(); 
    }

    @Override
    public void viajar() {
        super.viajar(); 
    }
    
    public void darMasaje(){
        System.out.println("Da un masaje");
    }
    
    
    
}
