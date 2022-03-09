/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registros;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import persona.*;
import vehiculos.*;

/**
 *
 * @author Sebastian gil
 */
public class Register {
    private ArrayList<String> danios;
    private Client Client;
    private Employee Employee;
    private Vehicle vehiculo;

    public Register() {
        
    }
    
    public void AddClient(){
        Client = new Client(JOptionPane.showInputDialog("Escriba el nombre del Client"),
                Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula "
                        + "del Client")),
                Integer.parseInt(JOptionPane.showInputDialog("cuando debe pagar")));
   
    }
    public Client Client(){
        return Client;
    }
    public void AddEmployee(){
        Employee = new Employee(JOptionPane.showInputDialog("Escriba el nombre del Employee"),
                Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula "
                        + "del Employee"))
                );
        
    }
    public Employee Employee(){
        return Employee;
    }
    private void AddCar(){
        vehiculo = new Car(
            JOptionPane.showInputDialog("Escriba la matricula del Car"),
            JOptionPane.showInputDialog("Escriba la marca del Car"),
            Integer.parseInt(JOptionPane.showInputDialog("Escriba el anio de la Car")),
            JOptionPane.showInputDialog("Escriba el tipo de traccion del Car ")
        );
      
    }
    public Vehicle showVehicle(){
        return vehiculo;
    }
    private void AddMotorcycle(){
        vehiculo = new Motorcycle(
            JOptionPane.showInputDialog("Escriba la matricula de la Motorcycle"),
            JOptionPane.showInputDialog("Escriba la marca de la Motorcycle"),
            Integer.parseInt(JOptionPane.showInputDialog("Escriba el anio de la Motorcycle")),
            JOptionPane.showInputDialog("Escriba el cilindrada de la Motorcycle")
        );
      
    }
    
    public void typeVehicle() {
        if(Integer.parseInt(JOptionPane.showInputDialog("marque el numero correspondiente al vehiculo: \n 1. Motorcycle \n 2. Car")) == 1){
           AddMotorcycle();
        }else{
           AddCar();
        }
    }
    public void Adddanios(){
        int cantidaddanios = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de daños del vehiculo"));
        for (int i = 0; i < cantidaddanios; i++) {
            danios.set(i, JOptionPane.showInputDialog("Describa el danio"));
        }
    }
    @Override
    public String toString() {
        String informacion = " Client: "+ Client.getFullName()+"\n Employee: "+ Employee.getFullName()
                + " \n vehiculo: " + vehiculo.getLicenseplateVehicle();

        if(Motorcycle.class.isInstance(vehiculo)){
            informacion += "\n tipo vehiculo Motorcycle";
        }else{
            informacion += "\n tipo vehiculo Car";
        }
        return informacion;
    }
    
    
    
}
