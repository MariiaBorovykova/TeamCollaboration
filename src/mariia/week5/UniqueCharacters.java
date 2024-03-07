package mariia.week5;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharacters {

    public static void main(String[] args) {
        uniqueCharacters("AAABBBCCCDEF");
    }

    public static void uniqueCharacters(String str){

        String newStr = "";

        for (int i = 0; i < str.length(); i++) {

            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }

            if (count==1){
                newStr += str.charAt(i);
            }
        }
        System.out.println("Unique characters = " + newStr);
    }




}
/*
Write a return  method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
 */