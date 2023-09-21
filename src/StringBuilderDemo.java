import java.util.Arrays;
import java.util.Scanner;

public class StringBuilderDemo {
    public static void main(String[] args) {
        // Khởi tạo đối tượng có 3 cách
        StringBuilder string = new StringBuilder("Trần Linh");
//        System.out.println(string);
        // Các phương thức làm việc
        // chèn vào cuối append()
//        string.append(". Tuổi: 23");
//        // chèn vào vị trí bất kì
//        string.insert(4, " hello world");
//        System.out.println(string);
//        // xóa chuỗi con
//        string.delete(4, 16);
//        System.out.println(string);
//        string.deleteCharAt(0);
//        System.out.println(string);
//        // đảo ngược chuỗi
//        string.reverse();
//        System.out.println(string);
//        // thay thế
//        string.replace(0, 5, " đã thay thế ");
//        System.out.println(string);
        // ví dụ áp dụng
        // cho phép người dùng nhập vào 1 chuỗi,
        // tìm kiếm ra chuỗi con có độ dài lớn nhất
        // mà sắp xếp các kí tự tăng dần
        // input: abcdbzjy
        // output: abcd
        StringBuilder str = new StringBuilder(new Scanner(System.in).nextLine());
        String arr = "";
        for (int i = 0; i < str.length(); i++) {
            StringBuilder subString = new StringBuilder();
            subString.append(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j - 1) < str.charAt(j)) {
                    subString.append(str.charAt(j));
                } else {
                    i = j;
                    break;
                }
            }
            if (arr.isEmpty()) {
                arr += subString;
            } else {
                arr += "," + subString;
            }
        }
        // chuyển đổi thành mảng
        String[] arraySubString = arr.split(",");
        int idMax = 0;
        for (int i = 0; i < arraySubString.length; i++) {
            if (arraySubString[i].length() > arraySubString[idMax].length()) {
                idMax = i;
            }
        }
        // hiển thị kết quả
        System.out.println("Chuỗi con dài nhất là: " + arraySubString[idMax]);
    }
}
