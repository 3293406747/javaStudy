/**
 * 幸运抽奖
 * 抽奖规则：会员号的百位数字等于产生的随机数字即为幸运会员
 */

import java.util.Scanner;

public class Study21_IfElse {
    public static void main(String[] args) {
        System.out.println("> 幸运抽奖\n");
        // Math.random() 产生一个0.0~1.0之间的随机小数 取不到1.0
        int luckNumber = (int) (Math.random() * 10);
        System.out.println("> 幸运数字数为：" + luckNumber);
        System.out.print("请输入四位会员号：");
        Scanner scanner = new Scanner(System.in);
        int uid = scanner.nextInt();
        int p = uid / 100 % 10;
        if (p == luckNumber) {
            System.out.println(uid + "号顾客为幸运会员，获精美MP3一个");
        } else {
            System.out.println(uid + "号客户，感谢您的支持!");
        }
    }
}
