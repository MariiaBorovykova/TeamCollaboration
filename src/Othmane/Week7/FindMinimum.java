package Othmane.Week7;

public class FindMinimum {
    public static void main(String[] args) {

        //Write a method that can find the minimum number from an int Array
        //Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6

        int[] arr = {99, 12, 23, 32, 44, 57, 6};

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if(arr[i]<min){
                min=arr[i];
            }

        }

        System.out.println("min = " + min);
    }


}
