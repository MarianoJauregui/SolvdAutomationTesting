package sortingAlgorithms;

import java.util.Arrays;

public class SortingAlgorithms {
    //BubbleSort
    public static void main(String[] args) {
        int arrayOfInts[] = {2, 5, 54, 67, 123, 13, 7, 56, 789};
        int value = 0;

        for (int i = 0; i < arrayOfInts.length; i++) {
            for (int j = i + 1; j < arrayOfInts.length; j++) {
                if (arrayOfInts[i] > arrayOfInts[j]) {
                    value = arrayOfInts[i];
                    arrayOfInts[i] = arrayOfInts[j];
                    arrayOfInts[j] = value;
                }
            }
        }
        System.out.println(Arrays.toString(arrayOfInts));
    }
}