package models;

public class Pair<K, V> {
    public K First;
    public V Second;

    public Pair(K first, V second){
        this.First = first;
        this.Second = second;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", this.First, this.Second);
    }
}
