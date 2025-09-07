package houyue.learn.yunsuanfu;

import java.util.Scanner;

public class TripleOperatorTsxt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重");
        int tiger1 = sc.nextInt();
        System.out.println("请输入第二只老虎的体重");
        int tiger2 = sc.nextInt();

        String result = tiger1 > tiger2 ? "第一只" : "第二只";
        System.out.println(result + "更重");
    }
}
