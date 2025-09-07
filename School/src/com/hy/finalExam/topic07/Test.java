package com.hy.finalExam.topic07;

import java.util.Scanner;

public class Test {
    private static String localPart;
    private static String domain;
    public static void main(String[] args) {
//        7.接收相户输入的邮箱名，获取邮箱的名字:
//        比如:cxy@163.com, 输出 cxy
        Scanner sc = new Scanner(System.in);
        String mail;
        do {
            System.out.println("请输入邮箱:");
            mail = sc.next();
        } while (!verifyMail(mail));
        System.out.println(localPart);
    }

    public static boolean verifyMail(String mail) {
        if (mail == null) {
            System.out.println("邮箱为空");
            return false;
        }
        int index = mail.indexOf("@");
        if (index != mail.lastIndexOf('@') || index == -1) {
            System.out.println("'@'个数错误");
            return false;
        }
        localPart = mail.substring(0, index);
        domain = mail.substring(index + 1);
        boolean f1 = verifyLocalPart(localPart);
        boolean f2 = verifyDomain(domain);
        return f1 && f2;
    }

    public static boolean verifyLocalPart(String localPart) {
//        ! # $ % & ' * + - / = ? ^ _ ` { | } ~
        if (localPart.startsWith(".")) {
            System.out.println("用户名部分不能以'.'开头");
            return false;
        }
        if (localPart.endsWith(".")) {
            System.out.println("用户名部分不能以'.'结尾");
            return false;
        }
        if (localPart.contains("..")) {
            System.out.println("用户名部分不能连续出现2个'.'");
            return false;
        }
        if (localPart.length() > 64) {
            System.out.println("用户名部分不能超过64个字符");
            return false;
        }
        char[] chars = {'!', '#', '$', '%', '&', '\\', '\'', '*', '+', '-', '/', '=', '?', '^', '_', '`', '{', '|', '}', '~'};
        for (int i = 0; i < localPart.length(); i++) {
            char c = localPart.charAt(i);
            if (!verifyLocalPartChar(c, chars)) {
                System.out.println("用户名部分包含非法字符");
                return false;
            }
        }
        return true;
    }

    public static boolean verifyDomain(String domain) {
        if (domain.length() > 253) {
            System.out.println("域名部分最多 253 个字符");
            return false;
        }
        if (domain.contains("..")) {
            System.out.println("域名部分不能连续出现2个'.'");
            return false;
        }
        if (domain.substring(domain.lastIndexOf(".") + 1).length() < 2) {
            System.out.println("顶级域长度太短");
            return false;
        }
        for (int i = 0; i < domain.length(); i++) {
            char c = domain.charAt(i);
            if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < '0' || c > '9') && c != '-' && c != '.') {
                System.out.println("域名部分包含非法字符");
                return false;
            }
        }
        if (domain.contains(".-") || domain.contains("-.") || domain.startsWith(".") || domain.startsWith("-") || domain.endsWith("-")) {
            System.out.println("标签不能以 - 开头或结尾");
            return false;
        }
        return true;
    }

    public static boolean verifyLocalPartChar(char c, char[] chars) {
        if ((c < 'A' || c > 'Z') && (c < 'a' || c > 'z') && (c < '0' || c > '9')) {
            for (int i = 0; i < chars.length; i++) {
                if (c == chars[i]) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
}
