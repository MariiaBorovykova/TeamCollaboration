package Merve;

public class DivideWithoutDivision {

    public static void main(String[] args) {

        Divide(5, 2);
        Divide(5, 3);
        Divide(10, 3);
        Divide(8, 4);

    }

    public static void Divide(int num1, int num2) {


        int n = num1;

        int result = 0;

        while (num1>=num2){
            num1 = num1 - num2;
            result ++;
        }

        System.out.println(n + " / " + num2 + " is " + result + " with the remainder " + num1);

    }

}


//Write a method that can divide two numbers without using division operator