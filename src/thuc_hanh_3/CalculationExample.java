package thuc_hanh_3;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("hãy nhập x: ");
        int x = scanner.nextInt();
        System.out.println("hãy nhập y: ");
        int y=scanner.nextInt();
        CalculationExample calc=new CalculationExample();
        calc.calculate(x,y);
    }
    private  void calculate(int x,int y){
        try{
            int a = x+y;
            int b = x-y;
            int c = x*y;
            int d= x/y;
            System.out.println("tổng x+y = "+a);
            System.out.println("hiệu x-y = "+b);
            System.out.println("tích x*y = "+ c);
            System.out.println("thương x/y = "+d);
        }catch (Exception e){
            System.out.println("xảy ra ngoại lệ : " + e.getMessage());
        }
    }
}
