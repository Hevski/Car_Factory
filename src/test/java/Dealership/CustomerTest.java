package Dealership;

import CarParts.Engine;
import CarParts.IVehiclePart;
import Dealership.Customer;
import Vehicles.MotorBike;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CustomerTest {

    Customer customer;
    MotorBike motorBike;
    Engine engine;

    @Before
    public void before(){
        customer = new Customer("Heather", 50000);
        engine = new Engine("2l", 56, "petrol");
        motorBike = new MotorBike (22000, "blue", engine);
    }

    @Test
    public void hasName(){
        assertEquals("Heather", customer.getName());
    }

    @Test
    public void hasMoneyr(){
        assertEquals(50000, customer.getMoney());
    }

    @Test
    public void canBuyVehicle(){
        customer.buysVehicle(motorBike);
        assertEquals(28000, customer.getMoney());
    }
}
