package mariia.week6;

public class String_PasswordValidation {

    public static void main(String[] args) {

        System.out.println(passwordValidation("poiu"));
        System.out.println(passwordValidation("iu pppp"));
        System.out.println(passwordValidation("llllll"));
        System.out.println(passwordValidation("Mjdfb3487"));
        System.out.println(passwordValidation("Mjdfb*#"));
        System.out.println(passwordValidation("8452jdfb*#"));
        System.out.println(passwordValidation("Mjdfb3 4*@"));
        System.out.println(passwordValidation("Mjdfb34*@"));

    }

    public static String passwordValidation(String password) {

        boolean isUpperCase = false;
        boolean isLowerCase = false;
        boolean isSpecialChar = false;
        boolean isDigit = false;

        if (password.length() < 6) {
            return "Incorrect password. It should be at least 6 characters";
        } else if (password.contains(" ")) {
            return "Incorrect password. It should not contains spaces";
        } else {

            for (int i = 0; i < password.length(); i++) {

                if (Character.isDigit(password.charAt(i))){
                    isDigit = true;
                }

                if (Character.isUpperCase(password.charAt(i))){
                    isUpperCase = true;
                }

                if (Character.isLowerCase(password.charAt(i))){
                    isLowerCase = true;
                }

                if (password.charAt(i) >= 33 && password.charAt(i) <= 47){
                    isSpecialChar = true;
                }
            }

            if (isDigit==isUpperCase==isLowerCase==isSpecialChar==true){
                return "Password is Secure!!!";
            }

        }

        return "INCORRECT!!!\nPassword should at least contain one upper-case letter, one lowercase letter, one special character and a digit";
    }
}
/*
1. Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper-case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special character
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns  false
 */
