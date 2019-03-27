package VehicleTests;

import CarParts.Engine;
import CarParts.IVehiclePart;
import Vehicles.MotorBike;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class MotorbikeTest {

    MotorBike motorBike;
    Engine engine;

    @Before
    public void before(){
        engine = new Engine("2l", 56, "petrol");
        motorBike = new MotorBike (22000, "blue", engine);
    }

    @Test
    public void hasSize(){
        Assert.assertEquals(22000, motorBike.getPrice());
    }

    @Test
    public void hasHorsePower(){
        Assert.assertEquals("blue", motorBike.getColour());
    }

    @Test
    public void hasVehiclePart() {
        IVehiclePart carPart = motorBike.getCarPart();
        assertNotNull(carPart);
    }
}
