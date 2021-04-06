import java.util.Scanner;

public class TH1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] arr;
        do {
            System.out.println("ENter a size");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Enter element: " + (i + 1) + ":");
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        for (int j = 0; j < arr.length / 2; j++) {
            int a = arr[j];
            arr[j] = arr[size - 1 - j];
            arr[size - 1 - j] = a;
        }
        System.out.printf("%-20s%s", "NewArray: ", "");
        for (int j = 0; i < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
    }
}
