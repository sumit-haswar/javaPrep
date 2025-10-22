import heap.EpiHeaps;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EpiHeapsTest {

    @Test
    public void mergeNSortedListsTest() {
        List<Integer> l1 = Arrays.asList(1,5,7,8,9);
        List<Integer> l2 = Arrays.asList(3,4,6,10,11);
        List<Integer> l3 = Arrays.asList(2);

        List<Iterator<Integer>> input = new ArrayList<>();
        input.add(l1.iterator());
        input.add(l2.iterator());
        input.add(l3.iterator());

        List<Integer> result = EpiHeaps.mergeNSortedLists(input);

        List<Integer> expected = Arrays.asList(1,2,3,4,5,6,7,8,9,10, 11);
        assertEquals(expected, result, "Incorrect output order");
    }

}
