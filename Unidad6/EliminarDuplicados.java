package Unidad6;

import java.util.Scanner;


/*
PR1 – Unidad 6 (6 Puntos)
Creación de 3 programas utilizando arreglos
1. EliminarDuplicados. Escriba una aplicación que reciba como entrada cinco números.
A medida que se lea cada número, almacenar en un arreglo unidimensional solamente
si no es un duplicado de un número que ya se haya leído, si lo es, debe solicitar al
usuario que vuelva a ingresar hasta que sea un número distinto a los ya ingresados.
Crear un método estático buscarDuplicado que retorne true si es un número duplicado
o false en caso contrario. Imprimir el arreglo cuando se hayan ingresado 5 números
distintos*/
public class EliminarDuplicados {

    public static void main(String[] args) {
        boolean r;
        int h = 0;
        int[] arreglo = new int[5];
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Introduzca un numero: ");
            int num = entrada.nextInt();
            //  System.out.println("numero arreglo: " + i );
            if (i == 0) {
                arreglo[0] = num;
            } else {
                r = buscarDuplicado(arreglo, num, i);
                while (r == true) {
                    System.out.println("Numero Duplicado! ");
                    System.out.print("Introduzca un numero: ");
                    num = entrada.nextInt();
                    r = buscarDuplicado(arreglo, num, i);

                }
                arreglo[i] = num;

            }

        }
        System.out.println("\nNumeros distintos: ");
        System.out.println("******************");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }

    }

    public static boolean buscarDuplicado(int[] array, int num, int lon) {
        boolean r = false;
        for (int i = 0; i < lon; i++) {
            //  System.out.println(array[i]);
            if (array[i] == num) {
                r = true;
            }
        }

        return r;

    }

}
