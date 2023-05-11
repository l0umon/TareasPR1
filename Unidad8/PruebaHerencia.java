package Unidad8;

import java.util.ArrayList;

/**
 *
 * @author Desarrollo
 */
public class PruebaHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<SeleccionFutbol> miembrosSelecion = new ArrayList<SeleccionFutbol>();

        Masajista masajista = new Masajista("Titulo Masajista", 10, 1, 40, "Guillermo", "Ortigoza");
        Entrenador entrenador = new Entrenador("1", 1, 50, "Julio", "Cesar");
        Fultbolista fubbolista = new Fultbolista(20, "Posicion Jugador", 1, 29, "Derlis", "Gonzalez");

        miembrosSelecion.add(masajista);
        miembrosSelecion.add(entrenador);
        miembrosSelecion.add(fubbolista);
//conertacion
        System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo metodo)");
        for (SeleccionFutbol integrante : miembrosSelecion) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellido() + " -> ");
            integrante.concentrarse();
        }
        //viaje       
        System.out.println("\nTodos los integrantes viajan. (Todos ejecutan el mismo metodo)");
        for (SeleccionFutbol integrante : miembrosSelecion) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellido() + " -> ");
            integrante.viajar();
        }
//entrenamiento

        System.out.println("\nEntrenamiento: Solamente el entrenador y el futbolista tiene el metodo de entrenar:");
        System.out.print(entrenador.getNombre() + " " + entrenador.getApellido() + " -> ");
        entrenador.dirigirEntrenamiento();
        System.out.print(fubbolista.getNombre() + " " + fubbolista.getApellido() + " -> ");
        fubbolista.entrenar();

//masaje
        System.out.println("\nMasaje: Solo el masajista tiene el metodo para dar masaje: ");
        System.out.print(masajista.getNombre() + " " + masajista.getApellido() + " -> ");
        masajista.darMasaje();

        //Partido de futbol
        System.out.println("\nPartido de futbol: Solamente el entrenador y el futbolista tiene el metodo para el partido de futbol)");
        System.out.print(entrenador.getNombre() + " " + entrenador.getApellido() + " -> ");
        entrenador.dirigirPartido();
        System.out.print(fubbolista.getNombre() + " " + fubbolista.getApellido() + " -> ");
        fubbolista.jugarPartido();

    }

}
