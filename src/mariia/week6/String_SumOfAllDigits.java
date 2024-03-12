package mariia.week6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class String_SumOfAllDigits {

    public static void main(String[] args) {
        sumOfAllDigits("12 java 5 apple 3");
    }

    public static void sumOfAllDigits(String string){

        String[] strArr = string.split(" ");

        System.out.println(Arrays.toString(strArr));

        int sum = 0;

        for (String each : strArr) {
            String newEach = "";
            for (int i = 0; i < each.length(); i++) {

                if ( Character.isDigit(each.charAt(i))){
                    newEach += each.charAt(i);
                }

            }

            if (!newEach.isEmpty()){
                System.out.println(newEach);
                sum += Integer.valueOf(newEach);
            }


        }

        System.out.println(sum);
    }
}
/*
Write a method that can return the sum of the digits in a string
Ex:  "12 java 5 apple 3"  ==>  20
 */