/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

import javax.swing.JOptionPane;
import modelo.Queue;
import registros.Register;

/**
 *
 * @author Sebastian gil
 */
public class main {

    public static void main(String[] args) {

        menu();

    }

    public static void menu() {
        Queue registedqueues = new Queue();
        int numeromenu = 0;
        while (numeromenu != 3) {
            numeromenu = Integer.parseInt(JOptionPane.showInputDialog(
                    "\n 1. crear registros"
                    + "\n 2. mostrar registros"
                    + "\n 3. salir"
            ));
            switch (numeromenu) {
                case 1:
                    Register reg = new Register();
                    reg.AddClient();
                    reg.typeVehicle();
                    reg.AddEmployee();
                    registedqueues.add(reg);
                    break;
                case 2:
                    registedqueues.showAll();
                    break;
                case 3:
                    JOptionPane.showConfirmDialog(null, "todo salio correcto");
                    numeromenu = 3;
                    break;

            }
        }

    }

}
