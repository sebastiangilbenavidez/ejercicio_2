/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

/**
 *
 * @author Ganso
 */
public class Vehicle {
    private String licenseplateVehicle;
    private String brandVehicle;
    private int yearvehicle;

    public Vehicle(String licenseplateVehicle, String brandVehicle, int yearvehicle){
        this.licenseplateVehicle = licenseplateVehicle;
        this.brandVehicle = brandVehicle;
        this.yearvehicle = yearvehicle;
    }
    public String getBrandVehicle() {
        return brandVehicle;
    }

    public String getLicenseplateVehicle() {
        return licenseplateVehicle;
    }


    
}
