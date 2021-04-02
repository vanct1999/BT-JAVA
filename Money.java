import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền:");
        double usd=sc.nextDouble();
        double vnd=usd*23000;
        System.out.println(vnd);

    }
}
