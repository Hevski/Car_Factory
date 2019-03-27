import Dealership.Till;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class TillTest {

    Till till;

    @Before
    public void before(){
        till = new Till(100000);
    }

    @Test
    public void hasMoney(){
        Assert.assertEquals(100000, till.getMoney());
    }

}
