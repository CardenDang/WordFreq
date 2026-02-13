package wordfreq;

import java.util.Arrays;

public class SurveyHeapDemo {
    private SurveyHeapDemo() {}

    public static void main(String[] args) {
        WordFreq[] data = {
            new WordFreq("happy", 400),
            new WordFreq("satisfied", 100),
            new WordFreq("neutral", 300),
            new WordFreq("would buy again", 200),
            new WordFreq("terrible", 160),
            new WordFreq("inconvenient", 900),
            new WordFreq("difficult to use", 100),
            new WordFreq("easy to use", 140),
            new WordFreq("would recommend to friends", 800),
            new WordFreq("visit the store", 700)
        };

        System.out.println("Before heapify:");
        System.out.println(Arrays.toString(data));
        
        WordFreqMaxHeap.buildMaxHeap(data); // heapify

        System.out.println("After heapify:");
        System.out.println(Arrays.toString(data));
        
        System.out.println("Indexed view:"); // print in an organized list
        for (int i = 0; i < data.length; i++) {
            System.out.println(i + ": " + data[i]);
        }
    }
}
