package elte.resources;

public class Copper extends Resource implements Meltable {
    @Override
    public Resource melt() {
        return new CopperPlate();
    }
}
