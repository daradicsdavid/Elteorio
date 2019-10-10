package elte.buildings;

import elte.buildings.production.Furnace;
import elte.buildings.resource_gathering.CoalMine;
import elte.buildings.resource_gathering.CopperMine;
import elte.resources.CopperPlate;
import elte.resources.Resource;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBeltLine {

    @Test
    public void testBeltLine() {
        //Given
        Gatherable coalMine = new CoalMine();
        Gatherable copperMine = new CopperMine();
        Furnace productive = new Furnace();
        BeltLine coalToFurnace = new BeltLine(coalMine, productive);
        BeltLine copperToFurnace = new BeltLine(copperMine, productive);
        Resource expected = new CopperPlate();

        //When
        copperToFurnace.move();
        coalToFurnace.move();

        //Then
        Resource result = productive.gather();
        assertEquals(expected, result);
    }
}
