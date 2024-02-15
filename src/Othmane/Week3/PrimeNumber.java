package Othmane.Week3;

public class PrimeNumber {
    public static void main(String[] args) {


        int n =5;
        int j =0;

        for (int i = 2; i <5; i++) {

          if(n%i==0){
              j++;
          }
        }


        if(j==0){
            System.out.println(n + " is a Prime Number");
        }else {
            System.out.println(n + " is not a prime number ");
        }

    }
}

//Numbers -- PrimeNumber
//Write a method that can check if a number is prime or not