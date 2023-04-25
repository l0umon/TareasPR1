
package Unidad2;

/**
 *
 * @author User
 */
public class Fecha {
    int dia, mes,anho;

    public Fecha(int dia, int mes, int anho) {
        this.dia = dia;
        this.mes = mes;
        this.anho = anho;
    }

    public Fecha() {
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }
    
    public void formatoFecha(){
    
     System.out.print( "Fecha Con formato DD/MM/YYYY:  " );
     System.out.printf( "%d / %d / %d " , dia , mes, anho );
}
    
}
