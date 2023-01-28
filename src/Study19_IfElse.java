/**
 * if结构省略写法
 * 如果一个条件下的执行代码只有一行 此时可以省略{}
 */

import java.util.Scanner;

public class Study19_IfElse {
    public static void main(String[] args) {
        System.out.println("请输入年龄：");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age > 18) System.out.println("成年了");
        else System.out.println("未成年");
    }
}
