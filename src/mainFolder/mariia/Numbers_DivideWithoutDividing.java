package mainFolder.mariia;

public class Numbers_DivideWithoutDividing {

    public static void divideWithoutDividing(int n1, int n2){

        int n = n1;
        int result = 0;

        while ( n >= n2 ){

            n = n - n2;
            result++;

        }
        System.out.println(n1 + " / " + n2 + " = " + result + " with reminder " + n1 % n2);
    }

    public static void main(String[] args) {

        divideWithoutDividing(10,3);

    }
}
