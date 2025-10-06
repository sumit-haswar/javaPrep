package heap;

import java.util.List;

public class Heap<T extends Comparable<T>> {

    public Heap(List<T> items){

    }

    public T peek(){

    }

    public void push(T element){

    }

    public T pop(){
        
    }

    public void heapify(){

    }

    private int getLeft(int idx){
        return 2 * idx + 1;
    }

    private int getRight(int idx){
        return 2 * idx + 2;
    }

    private int getParent(int idx){
        return (idx - 1) / 2;
    }

}
