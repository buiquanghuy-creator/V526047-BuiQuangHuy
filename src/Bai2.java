import java.util.Scanner;

public class Bai2 {

    public static void inMangTong(int[] a, int[] b) {
        int maxLen = Math.max(a.length, b.length);
        int[] c = new int[maxLen];

        System.out.print("Mảng tổng là: [ ");
        for (int i = 0; i < maxLen; i++) {
            int valA = (i < a.length) ? a[i] : 0;
            int valB = (i < b.length) ? b[i] : 0;
            c[i] = valA + valB;
            System.out.print(c[i] + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng 1: ");
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        System.out.println("Nhập các phần tử mảng 1:");
        for (int i = 0; i < n1; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        System.out.print("\nNhập số phần tử của mảng 2: ");
        int n2 = sc.nextInt();
        int[] b = new int[n2];
        System.out.println("Nhập các phần tử mảng 2:");
        for (int i = 0; i < n2; i++) {
            System.out.print("b[" + i + "] = ");
            b[i] = sc.nextInt();
        }

        System.out.println("\n--- KẾT QUẢ ---");
        inMangTong(a, b);

        sc.close();
    }
} 