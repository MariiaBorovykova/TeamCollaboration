package Othmane.Week7;

public class SortDescending {
    public static void main(String[] args) {

        //Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
        //Ex: int[] arr = {10,20,7, 8, 90};
        //arr = Sort(arr); ==> {90, 20, 10, 8, 7};


        int[] arr = {10,20,7, 8, 90};
        int min;

        for (int i = 0; i <arr.length ; i++) {

            min = arr[i];
            for (int j = i+1; j <arr.length ; j++) {

                if(arr[j]>arr[i]){
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
