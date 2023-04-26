package Unidad6;

import java.util.Scanner;

/**
 *
 * @author Desarrollo
 */
public class ArregloBidimensional {

    public static void main(String[] args) {
        int[][] matz1 = new int[3][4];
        int[][] matz2 = new int[4][5];
        Scanner entrada = new Scanner(System.in);
        int sumaf = 0;
        int sumac = 0;

        for (int f = 0; f < 3; f++) {
            sumac = 0;
            System.out.println("Fila " + (f + 1));
            for (int c = 0; c < 4; c++) {
                System.out.print("Columna " + (c + 1) + "=> ");
                int num = entrada.nextInt();
                matz1[f][c] = num;
                matz2[f][c] = matz1[f][c];
                sumaf += num;
                matz2[f][c + 1] = sumaf;

                sumac +=1;
                matz2[f + 1][c] = sumac;

            }
     
            sumaf = 0;

        }

        System.out.println("Arreglo Bidimensional 4 x 5 ");
        for (int f = 0; f < 4; f++) {

            for (int c = 0; c < 5; c++) {
                System.out.print(matz2[f][c] + "  ");

            }
            System.out.println();
        }

    }

}
