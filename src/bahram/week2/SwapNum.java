package bahram.week2;

public class SwapNum {
    public static void main(String[] args) {
        swapNumb(8, 12);

    }
    private static void swapNumb (int x, int y){
        x = x + y;
        y= x - y;
        x= x - y;

        System.out.println("x = " + x+ "\ny = " + y);


    }

    //Swap two variable values without using a third variable // third
}
