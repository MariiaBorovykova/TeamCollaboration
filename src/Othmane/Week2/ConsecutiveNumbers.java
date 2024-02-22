package Othmane.Week2;

public class ConsecutiveNumbers {
    public static void main(String[] args) {


        int n = 15;

        for (int i = 1; i <15 ; i++) {

            if(i%2==0){
                System.out.println("Codility");
            }
            if(i%3==0){
                System.out.println("Test");
            }
            if(i%5==0){
                System.out.println("Coders");
            }

            if(i%2==0 && i%3==0){
                System.out.println("CodilityTest");
            }
            if(i%5==0 && i%2==0 && i%3==0){
                System.out.println("CodilityTestCoders");
            }

        }
    }
}
