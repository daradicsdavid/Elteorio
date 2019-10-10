package elte.buildings.resource_gathering;

import elte.resources.Copper;
import elte.resources.Resource;

public class CopperMine extends Mine {

    @Override
    public Resource gather() {
        return new Copper();
    }
}
