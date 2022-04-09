package Heap;

public class minheap {
    
        int[] minHeap;

        int heapSize;

        int realSize= 0;

        // constructor 
        public minheap(int heapSize){
            this.heapSize = heapSize;

            // +1 because we will store the value from the one index in zero index store the dummy value
            minHeap = new int[heapSize+1];
            minHeap[0]=0;


        }

        // add element to the heap
        private void add(int element){
            realSize++;

            if(realSize > heapSize){
                System.out.println("Heap is already full can Insert");
                realSize--;
                return;
            }
            // here element is added to the desired position but may be due to this 
            // the min heap properity is voilated
            minHeap[realSize]=element;

            // the root elment is on index 1 and it doesnot have any parent 
            // so we ignore this check for the first time when elment is added to the root
            int index = realSize;
            int parent = index/2;

            // Now check wheather the index value is larger then its parent value 
            // then swap there value and change the index and parent value accordingly
            while(minHeap[index] < minHeap[parent] && index > 1){
                int temp = minHeap[index];
                minHeap[index] = minHeap[parent];
                minHeap[parent] = temp;

                index = parent;
                parent = index/2;
            }

        }

        // get the top element (minimum element) of heap
        private int peek(){
            return minHeap[realSize];
        }

        // delete the top element from the heap 
            private int pop(){
                if(realSize < 1){
                    System.out.println("There is no element is the Heap ");
                    return Integer.MAX_VALUE;
                }

                int minElement = minHeap[1];
                minHeap[1] = minHeap[realSize];
                realSize--;
                int index = 1;
                while(index <= realSize/2){
                    int left = 2 * index;
                    int right = (2 * index) +1;
                    if(minHeap[index]< minHeap[left] || minHeap[index]< minHeap[right]){
                        if(minHeap[left] < minHeap[right]){
                            int temp = minHeap[left];
                            minHeap[left] = minHeap[index];
                            minHeap[index] = temp;
    
                            index = left;
                        }
                        else{
                            int temp = minHeap[right];
                            minHeap[right] = minHeap[index];
                            minHeap[index] = temp;
    
                            index = right;
                        }
                    }
                    else{
                        break;
                    }
                }
                return minElement;
            }
        // get the size of the Min Heap 
        private int size(){
            return realSize;
        }

        // Print the heap 
        private void printHeap(){
            if(realSize < 1){
                System.out.println(" Heap is Empty");
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[ ");

            for(int i = 1; i<= realSize; i++){
                sb.append(minHeap[i]);
                sb.append(',');
            }

            sb.append(" ]");
            System.out.println(sb.toString());
        }
    


    public static void main(String[] args) {
        minheap mh = new minheap(8);
        mh.add(20);
        mh.add(10);
        mh.add(40);
        mh.add(13);
        mh.printHeap();
        mh.add(20);
        mh.add(10);
        mh.add(40);
        mh.add(13);
        mh.printHeap();
    }
}
