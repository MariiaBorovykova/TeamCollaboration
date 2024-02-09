package mariia.week3;

public class ReverseNegativeNumber {

    public static void main(String[] args) {

        System.out.println("reverseNegativeNumber = " + reverseNegativeNumber(-1234));
    }

    public static int reverseNegativeNumber(int n){

        String number = String.valueOf(n);
        String reverseNumber = "-";
        for (int i = (number.length()-1); i >= 1; i--) {
            reverseNumber += number.charAt(i);
        }

        return Integer.parseInt(reverseNumber);

    }
}
/*
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */