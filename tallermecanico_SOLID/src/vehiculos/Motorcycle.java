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
public class Motorcycle extends Vehicle {

    private String cylindercapacity;

    public Motorcycle(String licenseplateVehicle, String brandVehicle, int yearvehicle, String cylindercapacity) {
        super(licenseplateVehicle, brandVehicle, yearvehicle);  
        this.cylindercapacity = cylindercapacity;
    }

}
