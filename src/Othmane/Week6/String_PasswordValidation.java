package Othmane.Week6;

import java.util.regex.Pattern;

public class String_PasswordValidation {

    public static void main(String[] args) {
        String password = "GEEE@k0"; // Replace with the desired password

        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{6,}$";


        if (Pattern.matches(regex, password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

    //1. Write a return method that can verify if a password is valid or not.
    //requirements:
    //1. Password MUST be at least have 6 characters and should not contain space
    //2. PassWord should at least contain one upper-case letter
    //3. PassWord should at least contain one lowercase letter
    //4. Password should at least contain one special character
    //5. Password should at least contain a digit
    //if all requirements above are met, the method returns true, otherwise returns  false
}
