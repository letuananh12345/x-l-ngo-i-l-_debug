package bai_tap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleException extends Exception{
    public String message() {
        return "Không phải tam giác";
    }

    public void check(Integer canh1, Integer canh2, Integer canh3) throws IllegalTriangleException {
        if (canh1 <= 0 || canh2 <= 0 || canh3 <= 0 || !(canh1 + canh2 > canh3) || !(canh2 + canh3 > canh1) ||
                !(canh1 + canh3 > canh2)) throw new IllegalTriangleException();
    }

    public static void main(String[] args) {
        IllegalTriangleException test = new IllegalTriangleException();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("nhập cạnh a");
                int a = scanner.nextInt();
                System.out.println("Nhập cạnh b");
                int b = scanner.nextInt();
                System.out.println("nhập cạnh c");
                int c = scanner.nextInt();
                test.check(a, b, c);
                System.out.println("Đây là tam giác");
                System.exit(0);
            } catch (IllegalTriangleException e) {
                System.err.println(test.message());
            } catch (InputMismatchException e) {
                System.err.println("nhập sai định dạng");
            }
        }
    }
}


