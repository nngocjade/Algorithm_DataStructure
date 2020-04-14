package sorting_algorithm;

import java.util.Arrays;
/*
Insertion Sort if not a fast sorting algorithm because it uses nested loops to shift
items into place.

It is useful only for small data sets.

It runs in O(n^2).
 */
public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = {21,433,22,11,322,23,1,-24,-12};

        System.out.println("Unsorted array is: " + Arrays.toString(arr));

        SelectionSort(arr); //sorting array elements using bubble sort

        System.out.println("Array after bubble sort is:  " + Arrays.toString(arr));
    }

    //2D array grows exponentially On^2
    private static void SelectionSort(int[] arr) {
        for(int i = 0; i < arr.length-1; i++){
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++){
                if(arr[j] > arr[minIndex]){
                    minIndex = j;
                }
            }
            int minVal = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = minVal;
        }
    }
}
