package Othmane.Week4;

import java.sql.Array;
import java.util.Arrays;

public class SameLettre {

    public static void main(String[] args) {

        compaire("abc", "abx");
    }
    //Write a return method that checks if a string is built out of the same letters as another string.
    //  Ex: same("abc", "cab"); ==> true
    //      same("abc", "abb"); ==> false

    public static void compaire(String w,String x){
        if(w.length() == x.length()){

            char[] arr1 = new char[w.length()];
            char[] arr2 = new char[x.length()];

            for (int l = 0; l < w.length();l++) {
                arr1[l] = w.charAt(l);
                arr2[l] = x.charAt(l);
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if(Arrays.equals(arr1,arr2)){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
        }
    }
}
