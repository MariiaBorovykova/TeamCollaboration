package Othmane.Week6;

public class String_SumOfAllDigits {

    public static void main(String[] args) {

        //Write a method that can return the sum of the digits in a string
        //Ex:  "12 java 5 apple 3"  ==>  20

      String word = "12 java 5 apple 3";

        String[] str1 = word.split(" ");
         int s=0;

        for (String each : str1) {

            if(each.matches("\\d+")){
                s +=Integer.parseInt(each);
            }
        }
        System.out.println(s);

    }
}
