package Othmane.Week2;

public class DivisibleBy3_5_15 {
    public static void main(String[] args) {

        String DivisibleBy15=" ";
        String DivisibleBy5=" ";
        String DivisibleBy3=" ";

        for (int i = 1; i <=100 ; i++) {

            if (i % 15 == 0) {
                DivisibleBy15 += " "+ i;

            }
            if (i % 3 == 0 && i % 15 != 0) {
                DivisibleBy3 += " " + i;
            }
            if (i % 5 == 0 && i % 15 != 0) {
                DivisibleBy5  += " "+ i;
            }
        }

            System.out.println("Number divisible by 3-5-15 " + DivisibleBy15);
            System.out.println("Number divisible by 5 " +DivisibleBy5);
            System.out.println("Number divisible by 3 " +DivisibleBy3);


    }
}
