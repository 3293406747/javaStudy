/**
 * 嵌套if
 */

import java.util.Scanner;

public class Study23_IfElse {
    public static void main(String[] args) {
        System.out.print("> 请输入是否是会员(yes/no):");
        Scanner scanner = new Scanner(System.in);
        String p = scanner.next();
        System.out.print("请输入购物金额：");
        double money = scanner.nextDouble();
        double zk = 1.0;
        if (p.equals("yes")) {
            if (money >= 200) zk = 0.75;
            else zk = 0.8;
        } else if (p.equals("no")) {
            if (money >= 100) zk = 0.9;
        } else {
            System.out.println("输入错误");
        }
        System.out.println("实际支付:" + money * zk);
    }
}
