package com.hy.note.test04;

public class Test03 {
    public static void main(String[] args) {
        //public String[] split(String regex)
        //参数regex表示正则表达式。可以将当前字符串中匹配regex正则表达式的符号作为"分隔符"来切割字符串。

        //public String replaceAll(String regex,String newStr)
        //参数regex表示一个正则表达式。可以将当前字符串中匹配regex正则表达式的字符串替换为newStr。

        /*
            有一段字符串:小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠
            要求1:把字符串中三个姓名之间的字母替换为vs
            要求2:把字符串中的三个姓名切割出来
        */

        String s = "小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠";

        //要求1
        String regex1 = "[\\w&&[^_]]+";
        String result1 = s.replaceAll(regex1, "vs");
        System.out.println(result1);

        //要求2 
        String regex2 = "[\\w&&[^_]]+";
        String[] result2 = s.split(regex2);
        for (int i = 0; i < result2.length; i++) {
            System.out.println(result2[i]);
        }
    }
}
