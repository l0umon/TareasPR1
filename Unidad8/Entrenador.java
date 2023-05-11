/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad8;

/**
 *
 * @author Desarrollo
 */
public class Entrenador extends SeleccionFutbol{
    private String idFederacion;

    public Entrenador() {
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
        super.concentrarse(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void viajar() {
        super.viajar(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    public void dirigirPartido(){
        
    }
    
    public void dirigirEntrenamiento(){
        
    }
}
