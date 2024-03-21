package Othmane.Week7;

public class SortAscending {

    public static void main(String[] args) {

        //Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
        //Ex: int[] arr = {10, 9, 8, 7};
        //arr = Sort(arr); ==>{ 7, 8, 9, 10};

        int[] arr = {10, 9, 8, 7};
        int min;

        for (int i = 0; i <arr.length ; i++) {

            min = arr[i];
            for (int j = i+1; j <arr.length ; j++) {

                if(arr[j]<arr[i]){
                    min = arr[j];
                    arr[j]= arr[i];
                    arr[i]= min;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[i] = " + arr[i]);
        }
    }
}
