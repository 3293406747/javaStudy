/**
 * 字符串的比较
 * == 用于基本数据类型（8种）的比较
 * 字符串比较采用字符串的equals()方法比较相等
 */

import java.util.Scanner;

public class Study22_String {
    public static void main(String[] args) {
        System.out.print("> 请输入是否是会员(yes/no):");
        Scanner scanner = new Scanner(System.in);
        String p = scanner.next();
        if (p.equals("yes")) System.out.println("是会员");
        else if (p.equals("no")) System.out.println("不是会员");
        else System.out.println("输入错误");
    }
}
