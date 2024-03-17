package Merve.week7;

public class FindMinimum {

    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};

        int minimum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<minimum){
                minimum=arr[i];
            }
        }

        System.out.println(minimum);
    }


}
/*
Write a method that can find the minimum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
 */