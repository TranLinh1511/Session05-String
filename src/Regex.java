import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        System.out.println(validateUserName("unghxhung"));
        // yêu cầu nâng cao:
        // tạo lớp Validation kiểm tra sự chính xác của các dữ liệu sau:
        // email: gmail.com
        // số diện thoại : vietnam
        // mật khấu: bảo mật cao
        // ngày tháng năm: dd/MM/yyyy
        // validate chuỗi nhập vào có phải là số không : bắt người dùng nhập đến khi nhập đúng số thì mới hiển thị, nếu không là số thì bắt nhập lại.
    }
    public  static  boolean validateUserName(String userName){
        // Yêu cầu: 8-12 kí tự, không kí tự đặc biệt không có khoảng trắng, bắt đầu bằng chữ in hoa
        String pattern = "^[A-Z]{1}[a-zA-Z-0-9&&\\S]{7,11}$";
        Pattern patt = Pattern.compile(pattern);
        Matcher math = patt.matcher(userName);
        return  math.matches();
//        return  Pattern.matches("^[A-Z]{1}[a-zA-Z-0-9&&\\S]{7,11}$", userName);
//        return  userName.matches("^[A-Z]{1}[a-zA-Z-0-9&&\\S]{7,11}$");

    }
}
