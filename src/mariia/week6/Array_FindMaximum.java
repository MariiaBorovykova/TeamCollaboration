package mariia.week6;

public class Array_FindMaximum {

    public static void main(String[] args) {
        int[] arr = {7, 99, 12, 23, 32, 44, 57, 6};
        findMaxInArray(arr);
    }
    public static void findMaxInArray(int[] arr){
        int max = arr[0];
        System.out.println(max);
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
/*
Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
 */