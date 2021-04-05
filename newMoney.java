import java.util.Scanner;

public class newMoney {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số tiền muốn gửi: ");
        double money = sc.nextDouble();
        System.out.println("Số tháng gửi:");
        int month = sc.nextInt();
        System.out.println("lãi suất:");
        double rate = sc.nextDouble();
        double lai = money * (rate / 100) / 12 * month;
        System.out.println("Tiền lãi: " + lai);


    }
}
