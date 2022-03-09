/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author Ganso
 */
public class Client extends Person{
    private String cargo="Cliente";
    private int cuentaporpagar;

    public Client(String nombre, int cedula, int cuentaporpagar) {
        super(nombre, cedula);
        this.cuentaporpagar = cuentaporpagar;
    }
    
}
