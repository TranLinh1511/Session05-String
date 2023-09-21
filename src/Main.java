import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String fullName = "Trần Linh";
        System.out.println(fullName);
        fullName = "Nam béo";
        System.out.println(fullName);
        // so sánh 2 chuỗi
        System.out.println(fullName.equals("Nam béo"));
        // Tìm kiếm chuỗi con trong chuỗi cha
        System.out.println(fullName.contains("am"));
        // chuỗi bắt đầu và kết thúc
        System.out.println(fullName.startsWith("Na"));
        System.out.println(fullName.endsWith("Na"));
        // Kiểm tra 1 chuỗi có rỗng không
        String str = "";
        System.out.println(str.isEmpty());
        // Lấy vị trí của kí tự đầu tiên tìm được
        System.out.println(fullName.indexOf("b"));
        // Tìm kiếm và thay thế chuỗi theo patter
        String content = "Trong phần này, chúng ta sẽ phát triển một chương trình cho phép tìm kiếm giá trị\n" +
                "nhỏ nhất trong một mảng cho trước.";
        content.replace("tìm", "chó");
        System.out.println(content.replace("tìm", "chó"));
        // Nối chuỗi
        String newName = fullName.concat( " Hello");
        System.out.println(newName);
        // chuyển 1 chuỗi thành 1 mảng
        String numbers = "1,2,3,4,5,6,7";
        String arr[] = numbers.split(",");
        System.out.println(Arrays.toString(arr));

        // in hoa in thường, xóa khoảng trắng 2 đầu
        String demo = "     hello      ";
        System.out.println(demo.trim().toUpperCase());
        // bởi vì là 1 mảng kí tự nên có thể duyệt chuỗi
        for (int i = 0; i < demo.length(); i++) {
            System.out.println(demo.charAt(i));
        }
//        for (String ch:demo.split("")) {
//            System.out.println(ch);
//        }
        // sort
        System.out.println("A".compareTo("B"));
        // cắt chuỗi
        System.out.println(content.substring(10, 30));
    }
}