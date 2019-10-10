package elte.buildings;

import elte.buildings.production.CopperWireFactory;
import elte.buildings.production.Factory;
import elte.buildings.production.GreenCircuitFactory;
import elte.buildings.production.NothingProducedError;
import elte.resources.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TestFactory {

    @Test
    public void testCopperWireFactory_CopperWireWithCopper() {
        //Given
        Factory factory = new CopperWireFactory();
        Resource expected = new CopperWire();

        //When
        factory.produce(new CopperPlate());
        Resource result = factory.gather();

        //Then
        assertEquals(expected, result);
    }

    @Test(expected = NothingProducedError.class)
    public void testCopperWireFactory_CopperWireWithoutCopper() {
        //Given
        Factory factory = new CopperWireFactory();

        //When
        factory.gather();
    }

    @Test
    public void testGreenCircuitFactory_GreenCircuitWithIronPlateAndCopperWire() {
        //Given
        Factory factory = new GreenCircuitFactory();
        Resource expected = new GreenCircuit();

        //When
        factory.produce(new IronPlate());
        factory.produce(new CopperWire());
        Resource result = factory.gather();

        //Then
        assertEquals(expected, result);
    }

    @Test(expected = NothingProducedError.class)
    public void testGreenCircuitFactory_GreenCircuitWithoutIronPlateAndCopperWire() {
        //Given
        Factory factory = new GreenCircuitFactory();

        //When
        factory.produce(new CopperWire());
        factory.gather();
    }

    @Test(expected = NothingProducedError.class)
    public void testGreenCircuitFactory_GreenCircuitWithIronPlateAndWithoutCopperWire() {
        //Given
        Factory factory = new GreenCircuitFactory();

        //When
        factory.produce(new IronPlate());
        factory.gather();
    }
}
