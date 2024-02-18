package mariia.week4;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        System.out.println("AAABBCDD = " + frequencyOfChars("AAABBCDD"));
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

}
/*
Write a return method that can find the frequency of characters
  Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */