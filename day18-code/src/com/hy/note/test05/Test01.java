package com.hy.note.test05;

public class Test01 {
    public static void main(String[] args) {
        /*
        public String toString()            返回对象的字符串表示形式
        public boolean equals(object obj)   比较两个对象是否相等
        protected object clone(int a)       对象克隆
         */
        
        Object obj = new Object();
        String str = obj.toString();
        System.out.println(str);

        Student s = new Student(10, "lisi");
        String str1 = s.toString();
        System.out.println(str1);
        System.out.println(s);
    }
}
