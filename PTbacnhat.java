import java.util.Scanner;

public class PTbacnhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập a:");
        double a=sc.nextDouble();
        System.out.println("Nhập b:");
        double b=sc.nextDouble();
        System.out.println("Nhập c:");
        double c=sc.nextDouble();
        if (a==0){
            if (b==c){
                System.out.println("PT vô số nghiệm.");
            }else {
                System.out.println("Pt vô nghiệm");
            }
        }else {
            double d=(c-b)/a;
            System.out.println("Pt có nghiệm x = 4 " + d);
        }
    }
}
