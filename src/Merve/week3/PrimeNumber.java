package Merve.week3;

public class PrimeNumber {

    public static void main(String[] args) {

        PrimeOrNot(27);
        PrimeOrNot(13);
        PrimeOrNot(19);
        PrimeOrNot(28);
        PrimeOrNot(23);
        PrimeOrNot(2);
        PrimeOrNot(1);


    }

    public static void PrimeOrNot(int number){

        int count = 0;

        if (number>1) {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(number + " is prime");
            } else {
                System.out.println(number + " is not prime");
            }
        }

    }







}








/*
PrimeNumber
`Write a method that can check if a number is prime or not`


A prime number is a number that is divisible by only two numbers: 1 and itself. and must be greater than 1.


 */


