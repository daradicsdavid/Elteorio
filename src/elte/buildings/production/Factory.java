package elte.buildings.production;

import elte.buildings.Gatherable;
import elte.buildings.Productive;
import elte.resources.Resource;

public abstract class Factory implements Productive, Gatherable {
    protected Resource product;

    @Override
    public Resource gather() {
        return product;
    }
}
