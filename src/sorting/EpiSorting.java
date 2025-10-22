package sorting;

import models.Endpoint;
import models.Event;

import java.util.*;

public class EpiSorting {

    // 13.1 compute the intersection of two sorted arrays
    public static List<Integer> getIntersection(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>();
        Integer idxA = 0;
        Integer idxB = 0;
        while (idxA < a.size() && idxB < b.size()){

            if (a.get(idxA) < b.get(idxB)) {
                result.add(a.get(idxA));
                idxA++;
            } else if (b.get(idxB) < a.get(idxA)){
                result.add(b.get(idxB));
                idxB++;
            } else {
                result.add(a.get(idxA));
                idxA++;
                idxB++;
            }
        }

        while(idxA < a.size()){
            result.add(a.get(idxA));
            idxA++;
        }

        while(idxB < b.size()){
            result.add(b.get(idxB));
            idxB++;
        }

        return result;
    }

    // 13.2 merge two sorted arrays, "in-place" in A since len(A) > len(B)

    //13.6 render a calendar, WAP that takes a set of events and determines the max no. of events
    public static Integer getMaxEventCount(List<Event> events) {
        Collections.sort(events);
        List<Endpoint> endpoints = new ArrayList<>();
        for (Event event : events){

        }

        Deque<Integer> stack = new ArrayDeque<>();
        Integer last = stack.removeLast();
        Integer first = stack.removeFirst();
        return 0;
    }

    // 13.8 compute the union of intervals, takes a List, returns their union

    // 13.9 partition and sort an array with many repeated entries, preferably "in-place"

    // 13.7 merging intervals, take a disjoint set of interval pairs and add an input interval to it.

}
