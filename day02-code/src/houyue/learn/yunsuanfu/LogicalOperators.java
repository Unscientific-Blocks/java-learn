package houyue.learn.yunsuanfu;

public class LogicalOperators {
    public static void main(String[] args) {
//        与 &
        System.out.println(false & false);
        System.out.println(false & true);
        System.out.println(true & false);
        System.out.println(true & true);
//        或 ｜
        System.out.println(false|false);
        System.out.println(false|true);
        System.out.println(true|false);
        System.out.println(true|true);
//短路逻辑运算符
//        异或 ^
        boolean a = true;
        boolean b = false;
        System.out.println(a ^ a);

//        非  !
        System.out.println(a);
        System.out.println(!a);
        System.out.println(b);
        System.out.println(!b);
    }
}
