package bahram.week1;

public class FinRa {
    public static void main(String[] args) {

FinRa(50);
    }


    public static void FinRa(int a){
        String result = "";
        for (int i = 1; i < a; i++) {

            if (i % 15 == 0) {
                result += "FINRA ";
            } else if (i % 5 == 0) {
                result += "RA ";
            }else if(i%3==0){
                result += "FIN ";
            }else{
                result += i +" ";
            }

        }

        System.out.println(result);
    }
}
