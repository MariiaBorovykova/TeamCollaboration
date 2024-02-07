package bahram.week2;

public class ConsecutiveNum {
    public static void main(String[] args) {

        int a = 50;

        for (int i = 0; i < a+1; i++) {
            String result = "";
            if(i %2==0 ){
                result +="Codility";
            }
            if(i %3==0 ){
                result += "Test";
            }
            if(i %5==0){
                result += "Coders";
            }
            if (!result.isEmpty()){
                System.out.println(result);
            } else {
                System.out.println(i);
            }
        }

// first


    }
}
