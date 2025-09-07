package houyue.learn.yunsuanfu;

import java.util.Scanner;

public class OperatorsText02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的时髦度");
        int shihaodu1 = sc.nextInt();
        System.out.println("请输入她的时髦度");
        int shihaodu2 = sc.nextInt();
//        你的时髦度大于她的时髦度==成功==true
//        否则 false
        System.out.println(shihaodu1 >= shihaodu2);
    }
}
