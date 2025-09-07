package com.hy.note.test02;

public class Test02 {
    public static void main(String[] args) {
        /*
            正则表达式练习:
            需求
            请编写正则表达式验证用户名是否满足要求。要求:大小写字母，数字，下划线一共4-16位
            请编写正则表达式验证身份证号码是否满足要求。
            简单要求:
                18位，前17位任意数字，最后一位可以是数字可以是大写或小写的x
            复杂要求:
                按照身份证号码的格式严格要求。

            身份证号码:
            41080119930228457x
            510801197609022309
            15040119810705387X
            130133197204039024
            430102197606046442
        */

        //验证用户名是否满足要求。
        //要求:大小写字母，数字，下划线一共4-16位
        String regex1 = "\\w{4,16}";
        System.out.println("zhangsan".matches(regex1));
        System.out.println("lisi".matches(regex1));
        System.out.println("wangwu".matches(regex1));
        System.out.println("======================================");

        //正则表达式验证身份证号码是否满足要求。
        //简单要求:18位，前17位任意数字，最后一位可以是数字可以是大写或小写的x
        String regex2 = "[1-9]\\d{16}(\\d|X|x)";
        String regex3 = "[1-9]\\d{16}[\\dXx]";
        String regex5 = "[1-9]\\d{16}(\\d|(?i)x)";
        System.out.println("41080119930228457x".matches(regex5));
        System.out.println("510801197609022309".matches(regex5));
        System.out.println("15040119810705387X".matches(regex5));
        System.out.println("130133197204039024".matches(regex5));
        System.out.println("430102197606046442".matches(regex5));
        System.out.println("======================================");

        //忽略大小写
        String regex4 = "a((?i)b)c";
        System.out.println("ABC".matches(regex4));
        System.out.println("abc".matches(regex4));
        System.out.println("aBc".matches(regex4));
        System.out.println("======================================");

        //身份证号码的严格校验
        //前面6位:省份，市区，派出所等信息，第一位不能是0，后面5位是任意数字   [1-9]\d{5}
        //年的前半段: 18 19 20                                            (18|19|20)
        //年的后半段: 任意数字出现两次                                      \d{2}
        //月份: 01~ 09 10 11 12                                           (0[1-9]|1[0-2])
        //日期: 01~09 10~19 20~29 30 31                                   (0[1-9]|[1-2]\d|3[01])
        //后面四位: 任意数字出现3次 最后一位可以是数字也可以是大写x或者小写x   \d{3}(\d|(?i)x)
        String regex7 = "[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[0-2])([0-2]\\d|3[01])\\d{3}(\\d|(?i)x)";
        System.out.println("41080119930228457x".matches(regex7));
        System.out.println("510801197609022309".matches(regex7));
        System.out.println("15040119810705387X".matches(regex7));
        System.out.println("130133197204039024".matches(regex7));
        System.out.println("430102197606046442".matches(regex7));
    }
}
