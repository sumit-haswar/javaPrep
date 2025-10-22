package models;

public class KeyValueEntry<T> {

    public Integer IntKey;
    public String StrKey;
    public T Value;

    public KeyValueEntry() {

    }

    public KeyValueEntry(Integer intKey, String strKey, T value) {
        this.IntKey = intKey;
        this.StrKey = strKey;
        this.Value = value;
    }
}
