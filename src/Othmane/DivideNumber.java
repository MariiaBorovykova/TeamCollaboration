package Othmane;

public class DivideNumber {


    public void dived(int n1,int n2){

        int s=0;
        int r=0;
        int j=0;

        while (s<n1) {

           s+=n2;
           j++;
           r= s-n1;

        }
        System.out.println(j);
        System.out.println("the rest is :"+r);
    }

    public static void main(String[] args) {
        DivideNumber d = new DivideNumber();
        d.dived(6,3);
    }
}
