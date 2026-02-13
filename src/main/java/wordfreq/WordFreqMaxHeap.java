package wordfreq;

public class WordFreqMaxHeap {
    private WordFreqMaxHeap() {}
    
    /**
     * BUILD-MAX-HEAP procedure (bottom-up heap construction)
     * 
     * Leaves are heaps size 1
     * Start from the last parent index n/2 -1 and heapify down to index 0
     * After it runs -> parent.frequency >= child.frequency
     */
    public static void buildMaxHeap(WordFreq[] a) {
        if (a == null || a.length == 0) return;
        
        int n = a.length;

        for (int i = (n / 2) - 1; i >= 0; i--) {
            // maxHeapify call here, method not implemented yet
        }
    }

    /**
     * MAX-HEAPIFY
     * 
     * Fixes the heap at index i by pushing a[i] down until a[i] is >= both children or it becomes a leaf
     * 
     * @param a the array representing the heap
     * @param heapSize how many items are part of the heap
     * @param index i to heapify
     */
    private static void maxHeapify(WordFreq[] a, int heapSize, int i) {
        while (true) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            int largest = i;

            if (left < heapSize && a[left].frequency > a[largest].frequency) {
                largest = left;
            }


        }
    }
}
