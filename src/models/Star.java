package models;

public class Star implements Comparable<Star> {
    public Integer distance;
    public Star(Integer distance) {
        this.distance = distance;
    }

    @Override
    public int compareTo(Star other) {
        return this.distance.compareTo(other.distance);
    }
}
