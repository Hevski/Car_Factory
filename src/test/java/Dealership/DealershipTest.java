package Dealership;

import CarParts.Engine;
import Dealership.Dealership;
import Vehicles.Car;
import Vehicles.MotorBike;
import Vehicles.Vehicle;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Till till;
    Car car;
    Engine engine;
    MotorBike motorBike;
    Dealership dealership;
    ArrayList<Vehicle>vehicles;

    @Before
    public void before(){
        till = new Till(100000);
        engine = new Engine("2l", 56, "petrol");
        motorBike = new MotorBike(22000, "blue", engine);
        engine = new Engine("2l", 56, "petrol");
        car = new Car(22000, "blue", engine);
        dealership = new Dealership("CarFactory", till);
        vehicles = new ArrayList<Vehicle>();
        dealership.setVehicles(vehicles);
        vehicles.add(motorBike);
        vehicles.add(car);
    }

    @Test
    public void hasName(){
        assertEquals("CarFactory", dealership.getName());
    }

    @Test
    public void hasVehicles(){
        assertEquals(2, dealership.getVehicles().size());
    }

    @Test
    public void canSellVehicle(){
        dealership.sellVehicle(motorBike);
        assertEquals(1, dealership.getVehicles().size());
    }

    @Test
    public void tillMoneyIncreases(){
        dealership.sellVehicle(motorBike);
        assertEquals(122000, till.getMoney());
    }
}
