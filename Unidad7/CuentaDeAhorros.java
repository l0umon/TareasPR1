
package Unidad7;

/**
 *
 * @author l0umon
 */
public class CuentaDeAhorros {
    private static double tasalnteresAnual;
    private double saldoAhorros;

    public CuentaDeAhorros() {
    }

    public CuentaDeAhorros(double saldoAhorros) {
        this.saldoAhorros = saldoAhorros;
    }
    

    public static double getTasalnteresAnual() {
        return tasalnteresAnual;
    }

    public static void setTasalnteresAnual(double tasalnteresAnual) {
        CuentaDeAhorros.tasalnteresAnual = tasalnteresAnual;
    }

    public double getSaldoAhorros() {
        return saldoAhorros;
    }

    public void setSaldoAhorros(double saldoAhorros) {
        this.saldoAhorros = saldoAhorros;
    }
    
    
    public double calcularInteresMensual()
    {
        double interesMensual= saldoAhorros + ( saldoAhorros * tasalnteresAnual / 12);
        return interesMensual;
    }
    
    
}
