package baiTh;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai1 {
    public static void main(String[] args) {
        String email = new Scanner(System.in).nextLine();
        System.out.println(validationEmail(email));
    }

    public static boolean validationEmail(String email) {
        return email.matches("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,6}$");
    }
}
