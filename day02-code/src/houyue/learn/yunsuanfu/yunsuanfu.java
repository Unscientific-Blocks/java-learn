package houyue.learn.yunsuanfu;

public class yunsuanfu {
    public static void main(String[] args) {
        int a = 10;
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);
        a--;
        System.out.println(a);
        --a;
        System.out.println(a);
        int b = a++;
        a = 10;
        int c = ++a;
        System.out.println(b);//先用后加 b = 10
        System.out.println(c);//先加后用 c = 11
    }
}
