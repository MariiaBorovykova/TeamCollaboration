package mariia.week1;

public class Number_FINRA {

    public static void main(String[] args) {

        int n = 30;

        for (int i = 1; i <= n; i++) {

            if (i % 15 == 0){
                System.out.println("FINRA");
            } else if (i % 3 == 0){
                System.out.println("FIN");
            }else if (i % 5 == 0){
                System.out.println("RA");
            } else {
                System.out.println(i);
            }
        }
        System.out.println("-----------------------------------");

        for (int i = 1; i <= n ; i++) {

            String result = "";

            if (i % 3 == 0){
                result+= "FIN";
            }
            if (i % 5 == 0){
                result += "RA";
            }

            System.out.println(result.isEmpty() ? i : result);
        }
    }
}
