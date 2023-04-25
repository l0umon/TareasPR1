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
        int[] arreglo = new int[5];
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Introduzca un número: ");
            int num = entrada.nextInt();
            if (i == 0) {
                arreglo[0] = num;
            } else {
               /* buscarDuplicado();
           

            }
        }

    }

    public static boolean buscarDuplicado(int[] array, int num) {
        boolean r= false;
        for (int i = 0; i < 5; i++) {
            if (array[i] == num) {
                r= true;
            } else {
                r= false;
            }

        }
        
        return r;

    }

}
