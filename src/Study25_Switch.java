/**
 * switch透传现象
 */

import java.util.Scanner;

public class Study25_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("> 请输入整数:");
        int number = scanner.nextInt();
        switch (number) {
            case 0:         // 去掉break会透传 有时候会用到 多种情况结果一致时
            case 1:
                System.out.println("输入的是0或1");
                break;
            default:        // 相当于if结构中的else
                System.out.println("输入的是0、1外的其它数字");
                break;
        }
    }
}
