package heap;

import java.util.ArrayList;
import java.util.List;

public class Heap<T extends Comparable<T>> {
    private final List<T> heapItems = new ArrayList<>();
    private int heapSize = 0;

    public Heap(List<T> items) {
        for (T item : items) {
            this.heapItems.add(item);
        }
        this.heapSize = items.size();
        this.buildMaxHeap();
    }

    public List<T> getHeapItems() {
        return this.heapItems;
    }

    public T peek() {
        if (heapSize <= 0) {
            return null;
        }
        return this.heapItems.getFirst();
    }

    public void push(T element) {
        this.heapItems.add(element);
        this.heapSize++;
        this.incKey(element, this.heapSize - 1);
    }

    public T pop() {
        T top = this.heapItems.getFirst();
        // move first element to last element
        this.swap(0, this.heapSize - 1);
        this.heapItems.removeLast();
        this.heapSize--;

        this.heapify(0, this.heapSize - 1);
        return top;
    }

    private void buildMaxHeap() {
        int mid = getMid(0, this.heapSize - 1);
        for (int i = mid; i >= 0; i--) {
            this.heapify(i, this.heapSize - 1);
        }
    }

    private void incKey(T newVal, int idx) {
        while (idx >= 0 && this.heapItems.get(idx).compareTo(this.heapItems.get(this.getParent(idx))) > 0) {
            this.swap(idx, this.getParent(idx));
            idx = this.getParent(idx);
        }
    }

    private void heapify(int idx, int lastIdx) {
        // start from mid and keep heapifying till 0
        int leftIdx = getLeft(idx);
        int rightIdx = getRight(idx);

        int largestIdx = idx;

        // compare with left
        if (leftIdx <= lastIdx && this.heapItems.get(leftIdx).compareTo(this.heapItems.get(idx)) > 0) {
            largestIdx = leftIdx;
        }

        // compare with right
        if (rightIdx <= lastIdx && this.heapItems.get(rightIdx).compareTo(this.heapItems.get(largestIdx)) > 0) {
            largestIdx = rightIdx;
        }

        if (largestIdx != idx) {
            // swap and recur heapify
            this.swap(largestIdx, idx);
            heapify(largestIdx, lastIdx);
        }
    }

    private void swap(int idxA, int idxB) {
        T temp = this.heapItems.get(idxA); // A
        this.heapItems.set(idxA, this.heapItems.get(idxB)); // B <-- A
        this.heapItems.set(idxB, temp); // B <-- temp
    }

    private int getMid(int left, int right) {
        return left + ((right - left) / 2);
    }

    private int getLeft(int idx) {
        return 2 * idx + 1;
    }

    private int getRight(int idx) {
        return 2 * idx + 2;
    }

    private int getParent(int idx) {
        return (idx - 1) / 2;
    }

}
