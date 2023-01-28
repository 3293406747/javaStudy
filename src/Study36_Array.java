/**
 * 数组逆序输出
 */

public class Study36_Array {
    public static void main(String[] args) {
        char[] charSet = {'a', 'b', 'c'};
        for (int i = charSet.length - 1; i >= 0; i--) {
            System.out.println(charSet[i]);
        }
    }
}
