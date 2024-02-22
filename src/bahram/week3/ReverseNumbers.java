package bahram.week3;

public class ReverseNumbers {
    public static void main(String[] args) {
        int number = -12345;
        int reversedNumber = reverseNegativeNumber(number);
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversedNumber);
    }

    public static int reverseNegativeNumber(int num) {
        boolean isNegative = num < 0;
        if (isNegative) {
            num *= -1;
        }

        int reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return isNegative ? reversed * -1 : reversed;
    }
}
