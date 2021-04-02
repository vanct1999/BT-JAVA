import java.util.Scanner;

public class Sudungtoantu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài:");
        double a = sc.nextDouble();
        System.out.println("Nhập chiều rộng:");
        double b = sc.nextDouble();
        double c = a * b;
        System.out.println("Diện tích HCN: " + c);
    }
}
