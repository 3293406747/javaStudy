/**
 * switch结构
 * 使用switch的条件 等值判断
 * 可以使用的数据类型 1. int byte short char enum 2. String 3. long double float不支持
 */

import java.util.Scanner;

public class Study24_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("> 请输入整数:");
        int number = scanner.nextInt();
        switch (number) {       // switch 切换 开关
            case 0:
                System.out.println("输入的是0");
                break;
            case 1:
                System.out.println("输入的是1");
                break;
            default:        // 相当于if结构中的else
                System.out.println("输入的是0、1外的其它数字");
                break;
        }
    }
}
