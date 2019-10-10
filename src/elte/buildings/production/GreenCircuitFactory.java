package elte.buildings.production;

import elte.resources.CopperWire;
import elte.resources.GreenCircuit;
import elte.resources.IronPlate;
import elte.resources.Resource;

public class GreenCircuitFactory extends Factory {
    private Resource ironPlate;
    private Resource copperWire;

    @Override
    public void produce(Resource resource) {
        if (resource instanceof IronPlate) {
            ironPlate = resource;
        }
        if (resource instanceof CopperWire) {
            copperWire = resource;
        }
        if (ironPlate != null && copperWire != null) {
            product = new GreenCircuit();
        }
    }
}
