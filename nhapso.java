import java.util.Scanner;

public class nhapso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số :");
        int x=sc.nextInt();
        if(x<0){
            System.out.println("Đây là số nguyên âm");
        }else {
            System.out.println("Đây là số nguyên dương");
        }
    }
}
