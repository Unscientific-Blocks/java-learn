package com.hy.note.test10;

import java.util.Random;

public class Test01 {
    public static void main(String[] args) {
        /*
          生成验证码
          内容：可以是小写字母，也可以是大写字母，还可以是数字规则：
          长度为5
          内容中是四位字母，1位数字。
          其中数字只有1位，但是可以出现在任意的位置。*/
        Random random = new Random();
        char[] Captcha = new char[5];
        char[] letters = new char[52];
        char[] number = new char[10];
        for (int i = 0; i < letters.length; i++) {
            if (i < 26) {
                letters[i] = (char) ('a' + i);
            } else {
                letters[i] = (char) ('A' + i - 26);
            }
        }
        for (int i = 0; i < number.length; i++) {
            number[i] = (char) ('0' + i);
        }
        for (int i = 0; i < Captcha.length - 1; i++) {
            Captcha[i] = letters[random.nextInt(letters.length)];
        }
        Captcha[Captcha.length - 1] = number[random.nextInt(number.length)];
        int index = random.nextInt(Captcha.length);
        char temp = Captcha[Captcha.length - 1];
        Captcha[Captcha.length - 1] = Captcha[index];
        Captcha[index] = temp;
        String result = new String(Captcha);
        System.out.println(result);
    }
}
