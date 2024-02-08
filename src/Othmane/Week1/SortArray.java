package Othmane.Week1;

public class SortArray {
    public static void main(String[] args) {

        int[] array = {9,2,3,4,5,8,1,10,-5,7,15,2,5,1,-10};

        int j =0;
        for (int i = 0; i <array.length ; i++) {

            for (int k = i+1; k <array.length ; k++) {
                if(array[k]< array[i]){
                    j=array[k];
                    array[k]= array[i];
                    array[i]= j;
                }
            }
        }

        for (int i = 0; i <array.length ; i++) {

            System.out.println(array[i]);
        }

    }

}
