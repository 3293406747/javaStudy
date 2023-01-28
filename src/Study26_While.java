/**
 * while循环
 * while(条件){
 * 循环体;
 * 更新条件;
 * }
 */

public class Study26_While {
    public static void main(String[] args) {
        int i = 1, sum = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("sum:" + sum);
    }
}
