package Dealership;

import Vehicles.Vehicle;

public class Customer {

    private String name;
    private int money;

    public Customer(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public int buysVehicle(Vehicle vehicle){
        return this.money -= vehicle.getPrice();
    }
}
