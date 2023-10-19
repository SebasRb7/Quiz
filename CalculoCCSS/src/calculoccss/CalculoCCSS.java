/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculoccss;

/**
 *
 * @author sebas
 */
import javax.swing.JOptionPane;

public class CalculoCCSS {
    public static void main(String[] args) {
       
        String nClientesInput = JOptionPane.showInputDialog("Cuantos clientes son:");
        int nClientes = Integer.parseInt(nClientesInput);

        double montoSEM = 0.0;
        double montoTotalIVM = 0.0;

        for (int i = 0; i < nClientes; i++) {
            
            String salarioInput = JOptionPane.showInputDialog("Ingrese el salario del o los clientes " + (i + 1) + ":");
            double salario = Double.parseDouble(salarioInput);

            if (salario > 0) {
                double montoSEM = salario * 0.0925;
                montoSEM += montoSEM;
            }

            if (salario > 0) {
                double montoIVM = salario * 0.0508;
                montoTotalIVM += montoIVM;
            }
        }

        double montoTotal = montoSEM + montoTotalIVM;

        String mensaje = "La empresa deberá abonar a la CCSS el monto de ₡" + String.format("%.2f", montoSEM) + " por concepto de SEM y ₡" + String.format("%.2f", montoTotalIVM) + " por concepto de IVM.\n";
        mensaje += "Monto total a pagar a la CCSS: ₡" + String.format("%.2f", montoTotal);
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
