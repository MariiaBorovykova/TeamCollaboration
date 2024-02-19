package mariia.week4;

import java.util.Arrays;

public class SameLetters {

    public static boolean sameLetters(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] character1 = str1.toCharArray();
        char[] character2 = str2.toCharArray();

        for (int i = 0; i < character1.length; i++) {
            for (int j = 0; j < character1.length-1; j++) {
                if (character1[j] > character1[j+1]){
                    char temp = character1[j];
                    character1[j] = character1[j+1];
                    character1[j+1] = temp;
                }
            }
            for (int j = 0; j < character2.length-1; j++) {
                if (character2[j] > character2[j+1]){
                    char temp = character2[j];
                    character2[j] = character2[j+1];
                    character2[j+1] = temp;
                }
            }

        }

        return Arrays.equals(character1, character2);
    }

    public static boolean sameLetters2(String str1, String str2){
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        return Arrays.equals(char1, char2);

    }

    public static void main(String[] args) {

        System.out.println("sameLetters(\"abc\", \"cab\") = " + sameLetters("abc", "cab"));
        System.out.println("sameLetters2(\"abc\", \"cab\") = " + sameLetters2("abc", "cab"));
        System.out.println("sameLetters(\"abc\", \"abb\") = " + sameLetters("abc", "abb"));
        System.out.println("sameLetters2(\"abc\", \"abb\") = " + sameLetters2("abc", "abb"));

    }
}
/*
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
 */