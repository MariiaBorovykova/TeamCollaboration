package Merve.week5;

public class String_Reverse {

    public static void main(String[] args) {

        reverseString("ABCD");
        reverseString("merve");

    }

    public static void reverseString (String str){

        String reversedStr="";
        for (int i = str.length()-1 ; i >= 0 ; i--) {
            reversedStr+=str.charAt(i);
        }

        System.out.println(reversedStr);

    }

}
//Write a return method that can reverse  String
//Ex: Reverse("ABCD"); ==> DCBA