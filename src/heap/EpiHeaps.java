package heap;

import models.KeyValueEntry;
import models.Star;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class EpiHeaps {

    // get top-k longest strings of an iterator
    public static List<String> getTopKLongestStrings(int k, Iterator<String> stringIterator){
        PriorityQueue<String> pq = new PriorityQueue<>();
        int curr = 0;
        while (curr < k) {
            pq.add(stringIterator.next());
            curr++;
        }

        while (stringIterator.hasNext()) {
            String currStr = stringIterator.next();
            if (currStr.length() > pq.peek().length()) {
                pq.poll();
                pq.add(currStr);
            }
        }

        return pq.stream().toList();
    }

    // 10.1 merge sorted files
    public static List<Integer> mergeNSortedLists(List<Iterator<Integer>> listIterators) {
        List<Integer> result = new ArrayList<>();
        PriorityQueue<KeyValueEntry<Integer>> pq = new PriorityQueue<>((a, b) -> a.Value.compareTo(b.Value));

        for (int idx = 0; idx < listIterators.size(); idx++) {
            Iterator<Integer> currIt = listIterators.get(idx);
            KeyValueEntry<Integer> kv = new KeyValueEntry<>(idx, null, currIt.next());
            pq.add(kv);
        }

        while (!pq.isEmpty()) {
            KeyValueEntry<Integer> minEntry = pq.poll();

            result.add(minEntry.Value);

            Integer listIdx = minEntry.IntKey;
            Iterator<Integer> it = listIterators.get(listIdx);

            if (it.hasNext()){
                KeyValueEntry<Integer> currEntry = new KeyValueEntry<>(listIdx, null, it.next());
                pq.add(currEntry);
            }

        }

        return result;
    }

    // 10.4 compute the k closest stars

    // 10.3 sort an almost sorted array

    // 10.5 compute the median of online data

    // 10.6 compute the k largest elements in a max-heap

}
