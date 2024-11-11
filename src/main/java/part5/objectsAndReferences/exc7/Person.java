package part5.objectsAndReferences.exc7;

import part5.objectsAndReferences.exc6.Song;

import java.util.Objects;

public class Person {


    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public SimpleDate getBirthday() {
        return birthday;
    }

    public int getWeight() {
        return weight;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        if (this.height == ((Person) o).getHeight() &&
                this.name == ((Person) o).getName() &&
                this.weight == ((Person) o).getWeight() &&
                this.birthday == ((Person) o).getBirthday()) {
            return true;
        }

        Person other = (Person) o;
        if (this.height == ((Person) o).getHeight() &&
                this.name == ((Person) o).getName() &&
                this.weight == ((Person) o).getWeight() &&
                this.birthday.equals(other.getBirthday())) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(birthday); // Based only on name, matching the equals method
    }

}
