package Heap;

public class maxHeap {
    int[] maxheap;
    int heapsize;
    int realSize;
    private maxHeap(int heapSize){
        this.heapsize = heapSize;
        maxheap = new int[heapsize+1];
        maxheap[0]= 0;
    }

    // add element to the heap 
    private void add(int element){
        realSize++;
        if( realSize > heapsize){
            System.out.println(" heap is full cant add any element");
            return;
        }
        maxheap[realSize] = element;

        int index = realSize;
        int parent = index/2;

        while(maxheap[index] > maxheap[parent] && index > 1){
            int temp = maxheap[index];
            maxheap[index] = maxheap[parent];
            maxheap[parent] = temp;
            index = parent;
            parent = index/2;
        }
    }

    // return the top elment of the heap 
    private int peek(){
        return maxheap[1];
    }

    // return the size of the heap 
    private int size(){
        return realSize;
    }

    // print the heap elments
    private void printheap(){
            if(realSize < 1){
                System.out.println(" there is no element in the Heap");
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[ ");
            for(int i = 1 ; i<= realSize; i++){
                sb.append(maxheap[i]);
                sb.append(",");
            }
            sb.append(" ]");
             System.out.println(sb.toString());
    }

    // main method
    public static void main(String[] args) {
        maxHeap mx = new maxHeap(8);
        mx.add(10);
        mx.add(20);
        mx.add(110);
        mx.add(490);
        mx.add(203);
        mx.add(14);
        mx.printheap();
        System.out.println(mx.size()); 
        System.out.println(mx.peek()); 
    }

}
