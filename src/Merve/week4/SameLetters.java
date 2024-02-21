package Merve.week4;

import java.util.Arrays;

public class SameLetters {
    public static void main(String[] args) {

        haveSameLetters("abc", "cab");
        haveSameLetters("stop", "post");
        haveSameLetters("ali","veli");
    }

    public static void haveSameLetters (String str1, String str2){

        char [] arr1 = str1.toCharArray();
        System.out.println(arr1);
        char [] arr2 = str2.toCharArray();
        System.out.println(arr2);

        Arrays.sort(arr1);
        System.out.println(arr1);
        Arrays.sort(arr2);
        System.out.println(arr2);

        if (Arrays.equals(arr1, arr2)){
            System.out.println(str1+" and " + str2 + " have same letters.");
        } else {
            System.out.println(str1+" and " + str2 + " dont have same letters.");
        }

    }

}
/*
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
 */