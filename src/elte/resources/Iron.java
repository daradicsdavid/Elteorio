package elte.resources;

public class Iron extends Resource implements Meltable {

    @Override
    public Resource melt() {
        return new IronPlate();
    }
}
