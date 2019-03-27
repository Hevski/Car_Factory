package CarParts;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before() {
        engine = new Engine("2l", 56, "petrol");
    }

    @Test
    public void hasSize() {
        Assert.assertEquals("2l", engine.getSize());
    }

    @Test
    public void hasHorsePower() {
        Assert.assertEquals(56, engine.getHorsePower());
    }

    @Test
    public void hasType() {
        Assert.assertEquals("petrol", engine.getType());
    }

    @Test
    public void canBeAdded() {
        assertEquals("I've been added to Motorbike", engine.canAddPart("Motorbike"));
    }

}
