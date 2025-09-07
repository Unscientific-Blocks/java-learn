package houyue.learn.yunsuanfu;

import java.util.Scanner;

public class ShortCircuitLogicOperator {
    public static void main(String[] args) {
        boolean a0 =true;
        boolean b0 =false;

// 短路与 && 当第一位为假时直接输出假，不再与后一位计算，提高效率，运行结果和单个&一样
        System.out.println(a0 && b0);





// 短路或 || 当第一位为真时直接输出真，不再与后一位计算，提高效率，运行结果和单个｜一样
        System.out.println(a0 || b0);


        System.out.println("------------------------------------------------\n\n");
        int n1 = 5;
        int n2 = 5;
        boolean nn = ++n1 > 10 & ++n2 >10;
        System.out.println(n1);
        System.out.println(n2);

        int m1 = 5;
        int m2 = 5;
        boolean mm = ++m1 > 10 && ++m2 >10;
        System.out.println(m1);
        System.out.println(m2);



        System.out.println("------------------------------------------------\n\n");


//        键盘录入2个整数，只要其中一个有一位是6，或它们的和为6的倍数，输出结果为true，否则为false
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int b = sc.nextInt();

        int a1 = a % 10;
        int a2 = a / 10 % 10;
        int a3 = a / 100 % 10;
        int a4 = a / 1000 % 10;
        int a5 = a / 10000 % 10;

        int b1 = b % 10;
        int b2 = b / 10 % 10;
        int b3 = b / 100 % 10;
        int b4 = b / 1000 % 10;
        int b5 = b / 10000 % 10;



        System.out.println(a1 == 6 || a2 == 6 || a3 == 6 || a4 == 6 || a5 == 6 || b1 == 6 || b2 == 6 || b3 == 6 || b4==6 || b5 == 6 || ( a + b ) % 6 == 0);
    }
}
