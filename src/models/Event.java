package models;

public class Event implements Comparable<Event> {
    public Integer start;
    public Integer end;

    public Event(Integer start, Integer end){
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Event o) {
        return 0;
    }
}
