package houyue.learn.yunsuanfu;

import java.util.Scanner;

public class OperatorsText01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三位整数：");
        int i = sc.nextInt();
//        int a = n / 100;
//        int n1 = n % 100;
//        int b = n1 / 10;
//        int c = n % 10;
        int n1 = i % 10;
        int n2 = i / 10 % 10;
        int n3 = i / 100 % 10;





        System.out.println("个位数" + n1);
        System.out.println("十位数" + n2);
        System.out.println("百位数" + n3);
    }
}
