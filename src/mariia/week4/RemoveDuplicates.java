package mariia.week4;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String removeDup = "AAABBBCCC";

        System.out.println(removeDuplicates(removeDup));
        System.out.println(removeDuplicates2(removeDup));
    }

    public static String removeDuplicates(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (!result.contains(str.charAt(i) + "")) {
                result += str.charAt(i);
            }
        }

        return result;

    }

    public static String removeDuplicates2(String str) {

        Set<Character> strToChar = new LinkedHashSet<>();

        for (char each : str.toCharArray()) {
            strToChar.add(each);
        }
        return strToChar.toString();
    }


}
/*
Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
 */