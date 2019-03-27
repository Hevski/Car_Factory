import CarParts.Engine;
import CarParts.IVehiclePart;
import Dealership.Customer;
import Vehicles.MotorBike;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CustomerTest {

    Customer customer;

    @Before
    public void before(){
        customer = new Customer("Heather", 50000);
    }

    @Test
    public void hasName(){
        Assert.assertEquals("Heather", customer.getName());
    }

    @Test
    public void hasMoneyr(){
        Assert.assertEquals(50000, customer.getMoney());
    }
}
