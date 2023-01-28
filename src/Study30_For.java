/**
 * 循环 break 结束循环
 * continue 跳出当前循环进入下一次循环
 */

import java.util.Scanner;

public class Study30_For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("请输入成绩:");
            int score = scanner.nextInt();
            if (score < 0) break;
            sum += score;
            System.out.println("总成绩：" + sum);
        }
    }
}
