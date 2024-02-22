package Othmane.Week1;

public class OddEvenNumber {

    public void  oddEvenN(int n){

        if(n%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }

    }


    public static void main(String[] args) {
        OddEvenNumber oen = new OddEvenNumber();
        oen.oddEvenN(3);
    }



    }
