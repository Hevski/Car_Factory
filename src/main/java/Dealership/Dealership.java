package Dealership;

import Vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private String name;
    private Till till;
    private ArrayList<Vehicle> vehicles;

    public Dealership(String name, Till till){
        this.name = name;
        this.vehicles = new ArrayList<Vehicle>();
        this.till = till;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void sellVehicle(Vehicle vehicle){
        if (this.vehicles.contains(vehicle)){
            this.vehicles.remove(vehicle);
        }
        this.till.increaseMoney(vehicle.getPrice());
      }
    }
