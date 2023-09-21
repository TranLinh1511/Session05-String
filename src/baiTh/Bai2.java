package baiTh;

import java.util.Scanner;

public class Bai2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập tên đăng nhập: ");
        String userName = sc.nextLine();
        System.out.println(validationUserName(userName));
        System.out.print("Nhập mật khẩu: ");
        String password = sc.nextLine();
        System.out.println(validationPassword(password));
    }
    public static boolean validationUserName(String userName) {
        return userName.matches("^[a-zA-Z0-9._-]{3,}$");
    }
    public static boolean validationPassword(String pass) {
        return pass.matches("\"^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$\"");
    }
}
