/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Unidad7;

/**
 *
 * @author l0umon
 */
public class PruebaCuentaDeAhorros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CuentaDeAhorros ahorrador1 = new CuentaDeAhorros();
        CuentaDeAhorros ahorrador2 = new CuentaDeAhorros();
        ahorrador1.setSaldoAhorros(2000.00);
        ahorrador2.setSaldoAhorros(3000.00);
        double suma1, saldo, porc;
        double suma2;

        CuentaDeAhorros.setTasalnteresAnual(4);
        System.out.println("Saldo inicial del ahorrrador 1 es: " + ahorrador1.getSaldoAhorros());
        System.out.println("Saldo inicial del ahorrrador 2 es: " + ahorrador2.getSaldoAhorros());

        System.out.println("\nAhorrador 1");
        for (int i = 0; i < 12; i++) {
            saldo = ahorrador1.getSaldoAhorros();
            porc = ahorrador1.calcularInteresMensual();
            suma1 = saldo + porc;
            System.out.printf("\n Mes %d ==> %.2f + %.2f = %.2f", i + 1, saldo,
                    porc, suma1);

        }
        System.out.println();
        System.out.println("\nAhorrador 2");
        for (int i = 0; i < 12; i++) {
            saldo = ahorrador2.getSaldoAhorros();
            porc = ahorrador2.calcularInteresMensual();
            suma1 = saldo + porc;
            System.out.printf("\n Mes %d ==> %.2f + %.2f = %.2f", i + 1, saldo,
                    porc, suma1);
        }

    }

}
