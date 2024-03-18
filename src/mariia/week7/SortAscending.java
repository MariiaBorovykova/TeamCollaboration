package mariia.week7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortAscending {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        sortAscendingArray(arr);
    }

    public static void sortAscendingArray(int[] arr){

        //int[] sortArr = new int[arr.length];

        for (int i = 0; i < arr.length-1; i++) {

            for (int j = 0; j < arr.length-1-i; j++) {

                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}
/*
  **SortAscending**
```Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};```
 */