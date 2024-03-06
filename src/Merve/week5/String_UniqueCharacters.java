package Merve.week5;

public class String_UniqueCharacters {

    public static void main(String[] args) {

        uniqueCharacters("AAABBBCCCDEF");
        uniqueCharacters("AAABBBCCCDEFGH");

    }

    public static void uniqueCharacters(String str) {

        String unique = "";

        for (int i = 0; i < str.length() ; i++) {

            char ch = str.charAt(i);  // to get the each character of the string

          if (str.indexOf(ch)==str.lastIndexOf(ch)){   // first and last time appeared is the same which means its unique. it returns the same index number
              unique+=ch;

            }


        }System.out.println(unique);

    }
}


//Write a return  method that can find the unique characters from the String
//Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";