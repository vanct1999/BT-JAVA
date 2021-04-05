import java.util.Scanner;

public class hienthihinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Tam giác cân");
        System.out.println("Exit");
        System.out.println("Enter your choice:");
        int a = sc.nextInt();
        switch (a){
            case 1:
                for (int i=0;i<4;i++){
                    for (int j=0;j<8;j++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                for (int i=1;i<=5;i++){
                    for (int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 3:
                for (int i=5;i>=1;i--){
                    for (int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 4:
                for (int i=1; i<10; i += 2)
                {
                    for (int k=0; k < (4 - i / 2); k++)
                    {
                        System.out.print(" ");
                    }
                    for (int j=0; j<i; j++)
                    {
                        System.out.print("*");
                    }
                    System.out.println("");
                }

        }

    }
}
