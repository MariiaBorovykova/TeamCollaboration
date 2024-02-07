package bahram.week1;

public class DivideWithoutDividing {
    public static void main(String[] args) {

        DivideWithoutDividing(56, 5);

    }

    public static void DivideWithoutDividing(int a, int b) {
        if (a > 0 && b > 0) {
            int count = 0;

            while (a >= b) {
                a -= b;
                count++;
            }
            System.out.println(count + " with a remainder of " + a);
        } else {
            System.err.println("Negative Numbers");
        }
    }
}

