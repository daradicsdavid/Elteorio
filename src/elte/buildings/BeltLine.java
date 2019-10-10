package elte.buildings;

import elte.resources.Resource;

public class BeltLine {

    private Gatherable gatherable;
    private Productive productive;

    public BeltLine(Gatherable gatherable, Productive productive) {
        this.gatherable = gatherable;
        this.productive = productive;
    }

    public void move() {
        Resource resource = gatherable.gather();
        productive.produce(resource);
    }

}
