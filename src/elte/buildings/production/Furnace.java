package elte.buildings.production;

import elte.buildings.Gatherable;
import elte.buildings.Productive;
import elte.resources.Burnable;
import elte.resources.Meltable;
import elte.resources.Resource;


public class Furnace implements Productive, Gatherable {

    private Burnable burnable;
    private Meltable meltable;

    private Resource product;

    @Override
    public Resource gather() {
        return product;
    }

    @Override
    public void produce(Resource resource) {
        if (resource instanceof Burnable) {
            this.burnable = (Burnable) resource;
        } else if (resource instanceof Meltable) {
            this.meltable = (Meltable) resource;
        }
        if (burnable != null && meltable != null) {
            this.product = meltable.melt();
            this.burnable = null;
            this.meltable = null;
        }
    }
}
