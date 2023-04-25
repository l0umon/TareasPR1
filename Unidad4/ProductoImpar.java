
package Unidad4;

/**
 *
 * @author Usuario
 */
public class ProductoImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resul=1;
        
        for (int i = 1; i <= 15; i++) {
            if (i%2!=0){
                resul=resul*i;
            }
        }
        
        System.out.printf("El producto entre los productos impares del 1 al 15 son: %d ", resul);
    }
    
}
