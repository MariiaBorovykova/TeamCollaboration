package Othmane.Week4;

public class RemoveDuplicates {

    public static void main(String[] args) {

        duplicate("AAABBBCCC");


        //Write a return method that can remove the duplicated values from the String
        //  Ex: removeDup("AAABBBCCC") ==> ABC
    }

    public static void duplicate(String word){
        String result = "";

        for (int i =0 ; i <word.length() ; i++) {

            if(!(result.contains(word.charAt(i)+""))){
                result+=word.charAt(i);
            }else {
                continue;
            }
        }

        System.out.println(result);
    }
}
