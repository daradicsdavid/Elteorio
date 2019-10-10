package elte.buildings.production;

import elte.resources.CopperPlate;
import elte.resources.CopperWire;
import elte.resources.Resource;

public class CopperWireFactory extends Factory {

    @Override
    public void produce(Resource resource) {
        if (resource instanceof CopperPlate) {
            this.product = new CopperWire();
        }
    }
}
