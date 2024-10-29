package part5.objectsAndReferences.exc2;

public class Pet {
    private String name;
    private String breed;

    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return this.name;
    }

    public String getBreed() {
        return this.breed;
    }

    @Override
    public String toString() {
        return this.name + " " + this.breed;
    }
}
