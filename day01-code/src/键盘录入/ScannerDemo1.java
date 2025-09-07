package 键盘录入;
//import java.util.Scanner;
import java.util.Scanner;
public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入整数：");
        int i = scanner.nextInt();
        System.out.println(i);
        System.out.println(i + 100);
    }
}
