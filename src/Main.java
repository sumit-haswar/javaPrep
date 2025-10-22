import hashMap.EpiHashMap;
import heap.EpiHeaps;
import heap.Heap;
import models.KeyValueEntry;
import models.Pair;
import sorting.EpiSorting;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("sumit");
    arrayList.add("haswar");
    arrayList.add("this is a very long string");
    arrayList.add("this is also a very long string");
    arrayList.add("mountains");

//    List<String> res =  EpiHeaps.getTopKLongestStrings(1, arrayList.iterator());
    Set<Character> s = new HashSet<>();
    s.add('t');
    s.add('u');
//    s.add('p');
//    Pair<Integer, Integer> res = EpiHashMap.findSmallestSubArrayCoveringValues(Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'), s);

    List<Integer> res = EpiSorting.getIntersection(Arrays.asList(1,3,5,7,9, 10, 11, 12), Arrays.asList(2,4,6));

    Deque<Integer> dq = new ArrayDeque<>();
//    dq.addFirst(1);
//    dq.addFirst(2);
    dq.addLast(1);
    dq.addLast(2);
    dq.addLast(3);
//    Integer last = stack.removeLast();
    IO.println(dq);
    Integer first = dq.removeFirst();
    IO.println(dq);

//    printList(res);
//    IO.println(res);

    IO.println("--end--");

    LinkedList<Integer> ll = new LinkedList<>();
    LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
    TreeMap<Integer, String> treeMap = new TreeMap<>();

    PriorityQueue<KeyValueEntry<Integer>> pq = new PriorityQueue<>((a, b) -> a.Value.compareTo(b.Value));

    Deque<Integer> arrayDeque = new ArrayDeque<>();
    Deque<Integer> dqLL = new LinkedList<>();
    Deque<String> deque = new ConcurrentLinkedDeque<>(); // When multiple threads need to access or modify the deque concurrently without external synchronization.
    BlockingDeque<String> blockingDeque =
            new LinkedBlockingDeque<>(10); // Producer–consumer queues where threads need to wait for elements to appear or for space to become available.




}

public static void printList(List<Integer> list){
    String result = list.stream().map(String::valueOf).collect(Collectors.joining(", "));
    IO.println(result);
}

public static void printStrList(List<String> list){
    String result = list.stream().map(String::valueOf).collect(Collectors.joining(", "));
    IO.println(result);
}
