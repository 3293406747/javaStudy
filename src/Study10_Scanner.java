/**
 * 键盘输入功能 scanner 接收字符串类型输入
 */

import java.util.Scanner;       // 导包

public class Study10_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的姓名:");     // 提示信息
        String name = scanner.next();       // 等待用户输入
        System.out.println("您输入的姓名是:" + name);  // 输出
    }
}
