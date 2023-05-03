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
        ahorrador1.setSaldoAhorros(2000);
        ahorrador2.setSaldoAhorros(3000);

        CuentaDeAhorros.setTasalnteresAnual(4);

        for (int i = 0; i < 12; i++) {
            System.out.println("Mes " + i +  "==>" + ahorrador1.calcularInteresMensual());
            ahorrador1.calcularInteresMensual();
            ahorrador2.calcularInteresMensual();
        }

       
    }

}
