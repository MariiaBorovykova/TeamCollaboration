package ebru;

public class OddEven {

        public static void main(String[] args) {

            System.out.println(isOdd(0));

            System.out.println(isEven(0));
        }

        public static boolean isOdd(int num) {

            return (num % 2 != 0) ? true : false;
        }

        public static boolean isEven(int num) {

            return !isOdd(num);
        }
    }

}
