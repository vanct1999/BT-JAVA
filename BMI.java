import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cân nặng");
        double x = sc.nextDouble();
        System.out.println("Nhập chiều cao:");
        double y = sc.nextDouble();
        double bmi = x / Math.pow(y, 2);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        }
        if (18.5 <= bmi && bmi <= 25.0) {
            System.out.println("Normal");
        }
        if (25.0 <= bmi && bmi <= 30.0) {
            System.out.println("Overweight");
        }
        if (bmi >= 30.0) {
            System.out.println("Obese");
        }
    }
}
