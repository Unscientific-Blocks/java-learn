package houyue.learn.yunsuanfu;

import java.util.Scanner;

public class TripleOperatorText2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 150;
        int b = 210;
        int c = 165;
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        System.out.println(max);
    }
}
