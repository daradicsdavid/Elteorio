package elte.resources;

public abstract class Resource {
    @Override
    public boolean equals(Object obj) {
        return obj.getClass() == this.getClass();
    }
}
