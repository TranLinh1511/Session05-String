package Baitap;

import java.util.Arrays;
import java.util.Scanner;

public class BaiNangCao {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // yêu cầu nâng cao:
        // tạo lớp Validation kiểm tra sự chính xác của các dữ liệu sau:
        // email: gmail.com
        // số diện thoại : vietnam
        // mật khấu: bảo mật cao
        // ngày tháng năm: dd/MM/yyyy
        // validate chuỗi nhập vào có phải là số không : bắt người dùng nhập đến
        // khi nhập đúng số thì mới hiển thị, nếu không là số thì bắt nhập lại.


        String[] arr = {"Email", "Number phone", "Password", "Birth day"};
        String [] newArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (true) {
                System.out.print(arr[i]+": ");
                newArr[i] = sc.nextLine();
                if (validate(newArr[i], i)) {
                    if (i >= arr.length - 1) {
                        System.out.println("Ok!!!");
                    }
                    break;
                } else {
                    System.out.println("Nhập không đúng định dạng!!");
                }
            }
        }
    }

    public static boolean validate(String str, int choice) {
        String[] regex = {"^[A-Za-z0-9+_.-]+@(.+)$",
                "^(\\\\+?84|0)([0-9]{9,10})$",
                "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$",
                "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$"
        };
        return str.matches(regex[choice]);
    }
}
