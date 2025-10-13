import heap.Heap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(4);
    arrayList.add(9);
    arrayList.add(12);
    arrayList.add(3);
    arrayList.add(2);
    arrayList.add(1);
    arrayList.add(48);
    arrayList.add(94);

    Heap<Integer> myHeap = new Heap<>(arrayList);
    printList(myHeap.getHeapItems());
    myHeap.push(900);

    IO.println(myHeap.pop());
}

public static void printList(List<Integer> list){
    String result = list.stream().map(String::valueOf).collect(Collectors.joining(", "));
    IO.println(result);
}
