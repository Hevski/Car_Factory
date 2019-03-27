package VehicleTests;

import CarParts.Engine;
import CarParts.IVehiclePart;
import Vehicles.Car;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CarTest {

    Car car;
    Engine engine;


    @Before
    public void before(){
        engine = new Engine("2l", 56, "petrol");
        car = new Car(22000, "blue", engine);
    }

    @Test
    public void hasSize(){
        Assert.assertEquals(22000, car.getPrice());
    }

    @Test
    public void hasHorsePower(){
        Assert.assertEquals("blue", car.getColour());
    }

    @Test
    public void hasCarPart() {
        IVehiclePart carPart = car.getCarPart();
        assertNotNull(carPart);
    }
}
