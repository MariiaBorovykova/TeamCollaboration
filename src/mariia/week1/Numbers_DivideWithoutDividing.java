package mariia.week1;

public class Numbers_DivideWithoutDividing {

    public static void divideWithoutDividing(int n1, int n2){  // 10   2


        int n = n1;
        if( n1 < 0 || n2 < 0) {
            n = Math.abs(n1);
        }
        int result = 0;

        while ( n >= n2 ){ //10

            n = n - n2;  // 10 -2
            result++;    // 1

        }
        System.out.println(n1 + " / " + n2 + " = " + result + " with reminder " + n1 % n2);
    }

    public static void main(String[] args) {

        divideWithoutDividing(10,3);

    }
}
