package mariia.week3;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String answer = "";
        do {
            System.out.println("Enter your number");
            int number = input.nextInt();
            if (primeNumber(number)){
                System.out.println("Number " + number + " is prime");
            } else if (!primeNumber(number)) {
                System.out.println("Number " + number + " is NOT prime");
            }
            System.out.println("Do you want to enter one more number?(if YES press y");
            answer = input.nextLine();
        } while (input.nextLine().equalsIgnoreCase("y"));



    }

    public static boolean primeNumber(int n){
        if (n <= 1){
            return false;
        } else if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0){
            return false;
        }
        return true;
    }

}
/*
Write a method that can check if a number is prime or not
 */