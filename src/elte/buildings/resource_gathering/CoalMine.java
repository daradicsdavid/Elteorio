package elte.buildings.resource_gathering;

import elte.resources.Coal;
import elte.resources.Resource;

public class CoalMine extends Mine {

    @Override
    public Resource gather() {
        return new Coal();
    }
}
