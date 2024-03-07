package Othmane.Week5;

public class UniqueCharacters {

    public static void main(String[] args) {

        //Write a return  method that can find the unique characters from the String
        //Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";


        String word = "AAABBBCCCDEF";
        String word1 = "";

        for (int j = 0; j < word.length(); j++) {

            int k = 0;

            for (int i = 0; i < word.length(); i++) {


                if (word.charAt(i) == word.charAt(j)) {
                    k++;
                }

            }
            if (k>1) {
                continue;
            }

            word1 += word.charAt(j) + "";

        }

        System.out.println(word1);
    }

}
