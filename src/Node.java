public class Node {
    public String value;
    public Node next;
    public Node prev;
    public Node(String val, Node nxt, Node prev) {
        this.value = val;
        this.next = nxt;
        this.prev = prev;
    }

    public static String printLinkedList(Node head){
        StringBuilder sb = new StringBuilder();
        Node curr = head;
        while (curr != null) {
            sb.append(curr.value);
            curr = curr.next;
        }

        return sb.toString();

    }
}
