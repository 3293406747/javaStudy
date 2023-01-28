/**
 * 逻辑运算法 与或非
 * 与 && 都为真结果为真
 * 或 || 只要一个为真结果为真
 * 非 ！ 真变假 假变真
 */

import java.util.Scanner;

public class Study20_Boolean {
    public static void main(String[] args) {
        System.out.println("成绩：");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        if (score <= 100 && score >= 90) System.out.println("优秀");
        else if (score < 90 && score >= 80) System.out.println("良好");
        else if (score < 80 && score >= 60) System.out.println("及格");
        else if (score < 60 && score >= 0) System.out.println("不及格");
        else System.out.println("输入错误");
    }
}
