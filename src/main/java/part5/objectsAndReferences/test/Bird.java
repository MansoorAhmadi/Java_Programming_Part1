package part5.objectsAndReferences.test;

public class Bird {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
