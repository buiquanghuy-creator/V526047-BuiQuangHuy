import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập các số nguyên cách nhau bởi dấu cách:");
        String input = sc.nextLine().trim();
        
        if (input.isEmpty()) {
            System.out.println("Số phần tử: 0; Tổng: 0");
        } else {

            String[] sArr = input.split("\\s+");
            int soPhanTu = sArr.length;
            int tong = 0;
            
            for (String s : sArr) {
                tong += Integer.parseInt(s);
            }
            
            System.out.println("Số phần tử: " + soPhanTu + "; Tổng: " + tong);
        }
        sc.close();
    }
}