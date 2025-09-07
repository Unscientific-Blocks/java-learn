package houyue.learn.yunsuanfu;

public class TripleOperator {
    public static void main(String[] args) {
//        三元运算符
//        格式：
//        关系表达式 ? 表达式1 : 表达式2;
//        三元运算符的结果必须被使用
        int a = 10;
        int b = 20;
        System.out.println(a < b ? b : a);
        int min =  a > b ? b : a;
        System.out.println(min);
    }
}
