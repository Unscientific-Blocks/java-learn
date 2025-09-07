package com.hy.work.topic01;

import java.util.ArrayList;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        /*
        键盘录入一些1~100之间的整数，并添加到集合中。
        直到集合中所有数据和超过200为止。
         */
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            System.out.println("请输入一个1~100之间的整数:");
            String line = scanner.nextLine();
            int num = Integer.parseInt(line);
            if (num > 100 || num < 1) {
                System.out.println("请重新输入");
                continue;
            }
            list.add(num);
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }
            if (sum > 200) break;
        }
    }
}
