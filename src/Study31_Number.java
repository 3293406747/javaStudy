/**
 * 小数是模拟出来的数 近似值 不能用 == !=进行比较
 */

import java.util.Scanner;

public class Study31_Number {
    public static void main(String[] args) {
        System.out.println(0.9 + 0.8);
        final double P = 0.00001;       // 精度
        Scanner scanner = new Scanner(System.in);
        System.out.print("第一个数字:");
        double n1 = scanner.nextDouble();       // 0.9
        System.out.print("第二个数字:");
        double n2 = scanner.nextDouble();       // 0.8
        System.out.print("两数之和:");
        double n3 = scanner.nextDouble();       // 1.7
        if (n1 + n2 <= n3 + P && n1 + n2 >= n3 - P) System.out.println("n1+n2==n3");
        else System.out.println("n1+n2!=n3");
    }
}
