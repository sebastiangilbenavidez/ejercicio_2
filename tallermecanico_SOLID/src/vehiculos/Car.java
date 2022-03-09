/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

/**
 *
 * @author Sebastian gil
 */
public class Car extends Vehicle{
    
    private String traction;

    public Car(String licenseplateVehicle, String brandVehicle, int yearvehicle, String traction ){
        super(licenseplateVehicle, brandVehicle, yearvehicle);
        this.traction = traction;
        
    }
 
}
