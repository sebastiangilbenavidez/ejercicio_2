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
public class Employee extends Person{
    private String cargo="empleado";
    private int vehiculosarreglados;
    
    public Employee(String name, int DNI){
        super(name, DNI);
        this.vehiculosarreglados = this.vehiculosarreglados+1;
    }
    
    
}
