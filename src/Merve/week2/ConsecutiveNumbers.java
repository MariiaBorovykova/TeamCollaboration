package Merve.week2;

public class ConsecutiveNumbers {

    public static void main(String[] args) {


        consecutiveNumbers(30);


    }

    public static void consecutiveNumbers(int number) {

        String divisibleBy2 = "Codility";
        String divisibleBy3 = "Test";
        String divisibleBy5 = "Coders";


        for (int i = 1; i <= number; i++) {

            if (i % 30 ==0){
                System.out.println(divisibleBy2+divisibleBy3+divisibleBy5);
            } else if (i % 15 == 0) {
                System.out.println(divisibleBy3+divisibleBy5);

            } else if (i % 10 == 0) {
                System.out.println(divisibleBy2+divisibleBy5);

            } else if (i % 6 == 0) {
                System.out.println(divisibleBy2+divisibleBy3);

            } else if (i % 2 == 0) {
                System.out.println(divisibleBy2);

            } else if (i % 3 == 0) {
                System.out.println(divisibleBy3);

            } else if (i % 5 == 0) {
                System.out.println(divisibleBy5);

            } else {
                System.out.println(i);

            }
        }


    }


}



/*
Numbers -- print consecutive numbers
Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order. For example,
numbers divisible by both 2 and 3 should be replaced by CodilityTest and
numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.

 */