package elte.buildings.resource_gathering;

import elte.resources.Iron;
import elte.resources.Resource;

public class IronMine extends Mine {

    @Override
    public Resource gather() {
        return new Iron();
    }
}
