package Othmane.Week6;

public class Array_FindMaximum {

    public static void main(String[] args) {

        //Write a method that can find the maximum number from an int Array
        //Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99

        int[] arr = {99, 12, 23, 32, 44, 57, 6};

        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
