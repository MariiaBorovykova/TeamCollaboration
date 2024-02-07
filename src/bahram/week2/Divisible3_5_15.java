package bahram.week2;

public class Divisible3_5_15 {
    public static void main(String[] args) {

    dev3515(100);


    }
    public static void dev3515(int b) {
        String result1 = "Divisibel by 15 : ";
        String result2 = "Divisibel by 5 : ";
        String result3 = "Divisibel by 3 : ";

        for (int i = 1; i <= b; i++) {

            if (i % 15 == 0) {
                result1 += i+" ";
            } else if (i % 5 == 0) {
                result2 += i+" ";
            }else if(i%3==0){
                result3 += i+" ";
            }

        }
        System.out.println(result1 + "\n"+ result2 + "\n"+result3);
        //second
    }

}




