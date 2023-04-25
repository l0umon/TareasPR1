package Unidad4;

/**
 *
 * @author Desarrollo
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long x = 1, factorial = 1;
        do {
           
            for (long i = x; i > 0; i--) {
                factorial = factorial * i;
            }
            System.out.printf("\nEl factorial de %d es %d ", x, factorial);
            x++;
            factorial = 1;
           
        } while (x <= 20);

    }
}
