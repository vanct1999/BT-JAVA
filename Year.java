import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập năm");
        int x = sc.nextInt();
        int a = x % 4, b = x % 100, c = x % 400;
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Năm " + x + " là năm nhuận");
                } else {
                    System.out.println("Năm " + x + " ko phải năm nhuận");
                }
            } else {
                System.out.println("Năm " + x + " là năm nhuận");
            }
        } else {
            System.out.println("Năm " + x + " ko phải năm nhuận");
        }
    }
}
