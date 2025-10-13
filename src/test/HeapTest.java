import heap.Heap;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class HeapTest {

    @Test
    void testHeapInit() {
        List<Integer> list = new ArrayList<>(Arrays.asList(4, 9, 12, 13, 3, 2, 1, 48, 94));
        Heap<Integer> numericHeap = new Heap<>(list);

        assertEquals(9, numericHeap.getHeapItems().size(), "invalid heap items count");
        assertEquals(94, numericHeap.peek(), "largest number expected");
    }

    @Test
    void testPeek() {
        List<Integer> list = new ArrayList<>(Arrays.asList(4, 9, 12, 13, 3, 2, 1, 48, 94));
        Heap<Integer> numericHeap = new Heap<>(list);
        assertEquals(94, numericHeap.peek(), "largest number expected");
        numericHeap.push(789);
        assertEquals(789, numericHeap.peek(), "largest number expected");
        numericHeap.push(24);
        assertEquals(789, numericHeap.peek(), "largest number expected");
    }

    @Test
    void testPop() {
        List<Integer> list = new ArrayList<>(Arrays.asList(4, 9, 12, 13, 3, 2, 1, 48, 94));
        Heap<Integer> myHeap = new Heap<>(list);

        assertEquals(94, myHeap.pop(), "incorrect element popped");
        assertEquals(48, myHeap.pop(), "incorrect element popped");
        assertEquals(13, myHeap.pop(), "incorrect element popped");
    }

    @Test
    void testPush() {
        List<Integer> initList = new ArrayList<>(Arrays.asList(4, 9, 12, 13, 3, 2, 1, 48, 94));
        Heap<Integer> myHeap = new Heap<>(initList);

        assertEquals(94, myHeap.peek(), "incorrect value");
        myHeap.push(890);
        assertEquals(890, myHeap.peek(), "incorrect value");
        myHeap.push(898);
        assertEquals(898, myHeap.peek(), "incorrect value");
        myHeap.push(88);
        assertEquals(898, myHeap.peek(), "incorrect value");
    }
}
