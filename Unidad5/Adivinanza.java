package Unidad5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author l0umon
 */
public class Adivinanza {

    public static void main(String[] args) {
        int b = 1;
        Random numeroAleatorios = new Random();
        int numAdivinar;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Adivine un numero entre 1 y 20: ");
        int numIngresado = entrada.nextInt();
        while (numIngresado > 20 || numIngresado <= 0) {
            System.out.print("Numero no valido. Por favor ingrese un numero entre 1 y 20: ");
            numIngresado = entrada.nextInt();
        }
        numAdivinar = 1 + numeroAleatorios.nextInt(20);
        while (b == 1) {
            if (numAdivinar == numIngresado) {
                System.out.println("****¡Felicidades. Adivino el numero!*****");
                System.out.print("Desea jugar otra vez? 1= SI / 2=NO  ");
                b = entrada.nextInt();
                switch (b) {
                    case 1:
                        System.out.println("*********************************");
                        System.out.print("Adivine nuevamente un numero entre 1 y 20: ");
                        numIngresado = entrada.nextInt();
                        while (numIngresado > 20 || numIngresado <= 0) {
                            System.out.print("Numero no valido. Por favor ingrese un numero entre 1 y 20: ");
                            numIngresado = entrada.nextInt();
                        }
                        numAdivinar = 1 + numeroAleatorios.nextInt(20);
                        break;
                    case 2:
                        System.out.println("Gracias por jugar.");


                }

            } else {
                if (numIngresado < numAdivinar) {
                    System.out.println("Demasiado bajo. Intente de nuevo");
                    System.out.print("Adivine un numero entre 1 y 20: ");
                    numIngresado = entrada.nextInt();
                    while (numIngresado > 20 || numIngresado <= 0) {
                        System.out.print("Numero no valido. Por favor ingrese un numero entre 1 y 20: ");
                        numIngresado = entrada.nextInt();
                    }
                } else {
                    System.out.println("Demasiado alto. Intente de nuevo ");
                    System.out.print("Adivine un numero entre 1 y 20: ");
                    numIngresado = entrada.nextInt();
                    while (numIngresado > 20 || numIngresado <= 0) {
                        System.out.print("Numero no valido. Por favor ingrese un numero entre 1 y 20: ");
                        numIngresado = entrada.nextInt();
                    }
                }
            }

        }

    }

}
