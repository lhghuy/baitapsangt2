import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        int a = sc.nextInt();

        System.out.print("Nhập số thứ hai: ");
        int b = sc.nextInt();

        int tong = a + b;

        System.out.println("Tổng = " + tong);
    }
}