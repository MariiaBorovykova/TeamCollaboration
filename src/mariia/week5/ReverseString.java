package mariia.week5;

public class ReverseString {

    public static void main(String[] args) {
    reverseString("ABCD");
    }

    public static void reverseString(String str) {
        String newStr = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            newStr+= str.charAt(i)+"";
        }
        System.out.println(newStr);
    }
}
/*
Write a return method that can reverse  String
Ex: Reverse("ABCD"); ==> DCBA
 */