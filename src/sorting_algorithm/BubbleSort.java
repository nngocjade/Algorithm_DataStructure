package sorting_algorithm;

import java.util.Arrays;

/*
inefficient algorithm
rarely will be implemented
 */

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {21,44,22,11,43,23,2,34,22};

        System.out.println("Unsorted array is: " + Arrays.toString(arr));

        bubbleSort(arr); //sorting array elements using bubble sort

        System.out.println("Array after bubble sort is:  " + Arrays.toString(arr));
    }

    //2D array grows exponentially On^2
    private static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            for (int j = 1; j < arr.length-i; j++){
                if(arr[j - 1] > arr[j]){
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
