import java.util.Scanner;

public class SNT {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số cần kiểm tra: ");
        int a = sc.nextInt();

        if (a <= 1) {
            System.out.println(a + " không phải SNT");
        }
        if (a == 2) {
            System.out.println(a + " là SNT");
        }
        if (a > 2) {
            for (int i = 2; i < Math.sqrt(a); i++) {
                if (a % i == 0) {
                    System.out.println(a + " không phải SNT");
                    break;
                } else {
                    System.out.println(a + " là SNT");
                    break;
                }
            }
        }
    }
}
