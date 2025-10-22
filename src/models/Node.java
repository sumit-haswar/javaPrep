package models;

public class Node<T> {
    public T value;
    public Node<T> next;
    public Node<T> prev;
    public Node(T val, Node<T> nxt, Node<T> prev) {
        this.value = val;
        this.next = nxt;
        this.prev = prev;
    }

    public static String printLinkedList(Node head){
        StringBuilder sb = new StringBuilder();
        Node curr = head;
        while (curr != null) {
            sb.append(curr.value.toString());
            curr = curr.next;
        }

        return sb.toString();
    }
}
