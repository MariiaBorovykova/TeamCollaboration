package bahram.week4;

public class RemoveDublicate {
    public static void main(String[] args) {

        String a = "AAABBBCCC";

        char[] input = a.toCharArray();
        int n = input.length;
        System.out.println(removeDuplicate(input, n));
    }
        static String removeDuplicate(char[] str, int n) {
            int index = 0;
            for (int i = 0; i < n; i++) {
                int j;
                for (j = 0; j < i; j++) {
                    if (str[i] == str[j]) {
                        break;
                    }
                }
                if (j == i) {
                    str[index++] = str[i];
                }
            }
            return String.valueOf(str, 0, index);
        }
}
