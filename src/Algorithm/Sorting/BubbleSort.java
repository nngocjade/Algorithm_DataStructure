package Algorithm.Sorting;

public class BubbleSort {
    public static void main(String[] args) {

        int[] anArray = {21,44,22,11,43,23,2,34,22};

        System.out.println("before sort: " + anArray);

        bubbleSort(anArray); //sorting array elements using bubble sort

        System.out.println("after sort: " + anArray);
    }
    
    //2D array grows exponentially On^2
    private static void bubbleSort(int[] anArray) {
        for(int i = 0; i < anArray.length; i++){
            for (int j = 1; j < anArray.length-1; j++){
                if(anArray[j - 1] > anArray[j]){
                    int temp = anArray[j - 1];
                    anArray[j - 1] = anArray[j];
                    anArray[j] = temp;
                }
            }
        }
    }
}
