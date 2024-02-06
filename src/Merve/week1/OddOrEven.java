package Merve.week1;

public class OddOrEven {

    public static void main(String[] args) {

        EvenOdd(5);
        EvenOdd(6);

    }


    public static void EvenOdd(int number) {
        if (number % 2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }

}
/*


Write  a method which can identify given number is even or odd
*Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"*

 */