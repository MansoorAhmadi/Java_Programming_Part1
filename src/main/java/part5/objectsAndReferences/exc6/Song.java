package part5.objectsAndReferences.exc6;

import java.util.Objects;

public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song)) return false;

        if (this.artist == ((Song) o).getArtist() &&
        this.name == ((Song) o).getName() &&
        this.durationInSeconds == ((Song) o).getDurationInSeconds()) {
            return true;
        }
        return false;
    }

    public String getArtist() {
        return artist;
    }

    public String getName() {
        return name;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }
}
