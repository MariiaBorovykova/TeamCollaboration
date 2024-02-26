package Othmane.Week4;

public class FrequencyOfChars {

    public static void main(String[] args) {

        //Write a return method that can find the frequency of characters
        //  Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

        String word = "AAABBCDD";
        String word1="";

        for (int j = 0; j < word.length(); j++) {

            int k=0;

            for (int i = 0; i <word.length() ; i++) {


                if(word.charAt(i)== word.charAt(j) ){
                    k++;
                }

            }
            if(word1.contains(""+word.charAt(j))){
                continue;
            }

            word1 +=word.charAt(j)+""+k;

        }

        System.out.println(word1);
    }
}