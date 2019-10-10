package elte.buildings;

import elte.buildings.resource_gathering.*;
import elte.resources.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMines {

    @Test
    public void testCopperMine() {
        //Given
        Gatherable mine = new CopperMine();
        Resource expected = new Copper();

        //When
        Resource result = mine.gather();

        //Then
        assertEquals(expected, result);
    }

    @Test
    public void testIronMine() {
        //Given
        Gatherable mine = new IronMine();
        Resource expected = new Iron();

        //When
        Resource result = mine.gather();

        //Then
        assertEquals(expected, result);
    }

    @Test
    public void testCoalMine() {
        //Given
        Gatherable mine = new CoalMine();
        Resource expected = new Coal();

        //When
        Resource result = mine.gather();

        //Then
        assertEquals(expected, result);
    }

    @Test
    public void testOilWell() {
        //Given
        Gatherable oilWell = new OilWell();
        Resource expected = new Oil();

        //When
        Resource result = oilWell.gather();

        //Then
        assertEquals(expected, result);
    }
}
