package 变量;

public class VarTest {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("第零站" + count);

        count = count + 1;
        System.out.println("第一站" + count);

        count = count + 2 - 1;
        System.out.println("第二站" + count);

        count = count + 2 - 1;
        System.out.println("第三站" + count);

        count = count - 1;
        System.out.println("第四站" + count);

        count = count + 1;
        System.out.println("第五站" + count);

    }
}
