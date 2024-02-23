package bahram.week4;

import java.util.Arrays;

public class SameLetters {
    public static void main(String[] args) {
        /*Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false*/

        System.out.println(sameTest("abc", "cab"));
        System.out.println(sameTest("abc", "abb"));



    }


    public  static boolean sameTest(String a, String b){
        a = a.toLowerCase();
        b = b.toLowerCase();


        char[] charArray1 = a.toCharArray();
        char[] charArray2 = b.toCharArray();


        Arrays.sort(charArray1);
        Arrays.sort(charArray2);


        return Arrays.equals(charArray1, charArray2);
    }

}
