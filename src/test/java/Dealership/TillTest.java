package Dealership;

import CarParts.Engine;
import Dealership.Customer;
import Dealership.Dealership;
import Dealership.Till;
import Vehicles.Car;
import Vehicles.MotorBike;
import Vehicles.Vehicle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TillTest {

    Till till;
    Customer customer;
    MotorBike motorBike;
    Engine engine;
    Car car;
    Dealership dealership;
    ArrayList<Vehicle>vehicles;

    @Before
    public void before(){
        till = new Till(100000);
        customer = new Customer("Heather", 50000);
        engine = new Engine("2l", 56, "petrol");
        motorBike = new MotorBike(22000, "blue", engine);
        dealership = new Dealership("CarFactory");
        vehicles = new ArrayList<Vehicle>();
        dealership.setVehicles(vehicles);
        vehicles.add(motorBike);
        vehicles.add(car);
    }

    @Test
    public void hasMoney(){
        assertEquals(100000, till.getMoney());
    }

    @Test
    public void canIncrease(){
        till.increaseMoney(22000);
        assertEquals(122000, till.getMoney());
    }

}
