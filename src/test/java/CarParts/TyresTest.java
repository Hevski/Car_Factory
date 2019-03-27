package CarParts;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {

    Tyre tyre;

    @Before
    public void before(){
        tyre = new Tyre(17, "Michelin");
    }

    @Test
    public void hasSize(){
        Assert.assertEquals(17, tyre.getAlloySize());
    }

    @Test
    public void hasHorsePower(){
        Assert.assertEquals("Michelin", tyre.getBrand());
    }

    @Test
    public void canBeAdded() {
        assertEquals("I've been added to Motorbike", tyre.canAddPart("Motorbike"));
    }

}
