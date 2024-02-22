package mariia.week4;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        System.out.println("AAABBCDD = " + frequencyOfChars("AAABBCDD"));
        frequencyOfChars2("AAABBCDD");
    }

    public static String frequencyOfChars(String str) {

        String newStr = "";

        for (int i = 0; i < str.length(); i++) {

            char ch1 = str.charAt(i);
            int count = 0;

            if (!newStr.contains(ch1 + "")) {

                for (int j = i; j < str.length(); j++) {
                    char ch2 = str.charAt(j);
                    if (ch1 == ch2){
                        count++;
                    }

                }
                newStr += ch1 + "" + count;
            }

        }

        return newStr;
    }

    public static void frequencyOfChars2(String str){

            Map<Character, Integer> map = new LinkedHashMap<>();

            for (String each : str.split("")) {
                int frequency = Collections.frequency(Arrays.asList(str.split("")), each);

                //System.out.println(each + " : " + frequency);

                map.put(each.charAt(0), frequency);
            }

            System.out.println(map);

    }

}
/*
Write a return method that can find the frequency of characters
  Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */