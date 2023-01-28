/**
 * 键盘输入  scanner 接收整数、小数类型输入
 */

import java.util.Scanner;

public class Study11_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入整数:");
        int num1 = scanner.nextInt();
        System.out.println("输入的整数为:" + num1);
        double num2 = scanner.nextDouble();
        System.out.println("输入的小数为:" + num2);
    }
}
