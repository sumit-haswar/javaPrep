package hashMap;

import models.Node;

import java.util.HashMap;

public class ISBNCache {

    private HashMap<String, Node<String>> cache;
    private Integer cacheCount = 0;
    private Integer capacity;

    private Node<String> head = null;
    private Node<String> tail;

    ISBNCache(Integer capacity){
        this.cache = new HashMap<>();
        this.capacity = capacity;
    }

    public String getBook(String isbn){
        return "";
    }

    public void addBook(String isbn, String name) {
        if ((this.cacheCount + 1) < this.capacity){

        }

        // always add to head

        this.cacheCount++;
    }

    public void deleteBook(String isbn) {

    }

    private void removeNode() {

    }

    private void addHead(String value){

    }

    private void removeTail() {
        if (this.tail == null){
            return;
        }

        Node<String> newTail = this.tail.prev;

        this.tail.prev = null;
        newTail.next = null;

        this.tail = newTail;
    }

}
