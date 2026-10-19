import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử n: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        int tong = 0;
        
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
            tong += arr[i];
        }
        
        System.out.println("Tổng các phần tử trong mảng là: " + tong);
        sc.close();
    }
}