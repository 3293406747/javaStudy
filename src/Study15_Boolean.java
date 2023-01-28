/**
 * 关系运算符 > >= < <= == !=
 * 结果数据类型是布尔
 */

import java.util.Scanner;

public class Study15_Boolean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a:");
        int a = scanner.nextInt();
        System.out.print("enter b:");
        int b = scanner.nextInt();
        boolean r = a < b;
        System.out.println("result is: " + r);
    }
}
