// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package proe;

/**
 *
 * @author DIEGOO
 */
import javax.swing.*;

public class Proe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
// 1 al 23
        String numero;
        numero = JOptionPane.showInputDialog("digite numero:");
        int tamaño = numero.length();
        char u = numero.charAt(tamaño - 1);
        JOptionPane.showMessageDialog(null, u);
        if (u == '0' || u == '2' || u == '4' || u == '8') {

            JOptionPane.showMessageDialog(null, numero + "  Es divisible por 2 ");
        }
          else {
            JOptionPane.showMessageDialog(null, numero + "  No es divisible por 2 ");
}

        //DIVISOR DE 3
        int num = 0;
        int f;
        for (f = 0; f < numero.length(); f++) {
            num = num + Character.getNumericValue(numero.charAt(f));
        }

        if (num % 3 == 0) {
            JOptionPane.showMessageDialog(null, numero + "  Es divisible por 3 ");
        } else {
            JOptionPane.showMessageDialog(null, numero + "  No es divisible por 3 ");

        }

        //dividor de 5
   
        if (u == '0' || u == '5') {
            JOptionPane.showMessageDialog(null, numero + "  Es divisible por 5 ");
        } else {
            JOptionPane.showMessageDialog(null, numero + "  No es divisible por 5 ");
        }

    }
}


    //if,else son metodos de comparacion 
