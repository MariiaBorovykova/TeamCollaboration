package Othmane.Week3;

public class ReverseNegativeNumber {
    public static void main(String[] args) {

        int n = -35;

        String m = Integer.toString(n);
        String k="-";

        System.out.println(m);

        for (int i = m.length()-1; i >0 ; i--) {

            k+=m.charAt(i);
        }

        int j = Integer.parseInt(k);

        System.out.println(j);

    }
}

//Numbers -- Reverse Negative Number
//Write a return method that can reverse digits of a negative number and return it as int
//input: -35  output: -53
