package com.hy.note.test01;

public class Test01 {
    public static void main(String[] args) {
        /*
        假如现在要求校验一个qq号码是否正确。
        规则：6位及20位之内，0不能在开头，必须全部是数字
                先使用目前所学知识完成校验需求
        然后体验一下正则表达式检验。
        */
        String qq ="1234567890";
        //System.out.println(check(qq));
        System.out.println(qq.matches("[1-9]\\d{5,19}"));

    }

    public static boolean check(String qq) {
        if (qq.length() < 6 || qq.length() > 20) {
            return false;
        }
        if (qq.charAt(0) == '0') {
            return false;
        }
        for (int i = 0; i < qq.length(); i++) {
            char c = qq.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
