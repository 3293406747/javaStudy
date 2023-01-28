/**
 * for循环
 * 循环次数固定的
 * for (声明初始化循环变量; 条件; 修改循环变量){
 * 循环体;
 * }
 * 顺序 1. 声明初始化循环变量 2.循环体 3. 修改循环变量 4.条件判断
 */

import java.util.Scanner;

public class Study28_For {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println("和:" + sum);
        // example
        Scanner scanner = new Scanner(System.in);
        double sumScore = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("请输入5门功课第" + i + "门功课的成绩");
            sumScore += scanner.nextDouble();
        }
        System.out.println("平均分是" + sumScore / 5);
    }
}
