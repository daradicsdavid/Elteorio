package elte.buildings;

import elte.buildings.production.Furnace;
import elte.resources.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class TestFurnace {

    @Test
    public void testFurnace_WithCoalAndCopper() {
        //Given
        Furnace furnace = new Furnace();
        Resource expected = new CopperPlate();

        //When
        furnace.produce(new Coal());
        furnace.produce(new Copper());
        Resource result = furnace.gather();

        //Then
        assertEquals(expected, result);
    }

    @Test
    public void testFurnace_WithCoalAndWithoutCopper() {
        //Given
        Furnace furnace = new Furnace();

        //When
        furnace.produce(new Coal());
        Resource result = furnace.gather();

        //Then
        assertNull(result);
    }

    @Test
    public void testFurnace_WithoutCoalAndWithCopper() {
        //Given
        Furnace furnace = new Furnace();

        //When
        furnace.produce(new Copper());
        Resource result = furnace.gather();

        //Then
        assertNull(result);
    }

    @Test
    public void testFurnace_WithCoalAndIron() {
        //Given
        Furnace furnace = new Furnace();
        Resource expected = new IronPlate();

        //When
        furnace.produce(new Coal());
        furnace.produce(new Iron());
        Resource result = furnace.gather();

        //Then
        assertEquals(expected, result);
    }

}
