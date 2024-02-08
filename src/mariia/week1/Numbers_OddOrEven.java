package mariia.week1;

public class Numbers_OddOrEven {

    public static void main(String[] args) {
        odOrEven(10);
        odOrEven(11);
    }

    public static void odOrEven(int n){

        if (n % 2 == 0 ){
            System.out.println(n + " is even number");
        } else {
            System.out.println(n + " is odd number");
        }

    }
}
