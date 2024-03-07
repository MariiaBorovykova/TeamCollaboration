package Othmane.Week5;

public class ReverseString {
    public static void main(String[] args) {

        //Write a return method that can reverse  String
        //Ex: Reverse("ABCD"); ==> DCBA

        String rev ="ABCD";
        String res = "";

        for (int i = rev.length()-1; i >=0 ; i--) {

            res += rev.charAt(i)+"";
        }

        System.out.println(res);
    }
}
