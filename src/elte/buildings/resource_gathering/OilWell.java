package elte.buildings.resource_gathering;

import elte.buildings.Gatherable;
import elte.resources.Oil;
import elte.resources.Resource;

public class OilWell implements Gatherable {

    @Override
    public Resource gather() {
        return new Oil();
    }
}
