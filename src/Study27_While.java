/**
 * do while循环     ctrl+shift+f8 查看所有断点
 * do{
 * 循环体;
 * 更新条件;
 * }while(条件);
 */

public class Study27_While {
    public static void main(String[] args) {
        int i = 1, sum = 0;
        do {
            sum += i;
            i++;
        } while (i <= 100);
        System.out.println("sum:" + sum);
    }
}
